// class Employee extends Person{
//     Integer empid
//     String company
//     Integer salary
//     Employee(){}
//     Employee(String name, Integer age, String gender, String address, Integer empid, String company, Integer salary){
//         super(name,age,gender,address)
//         this.empid = empid
//         this.company = company
//         this.salary = salary
//     }

//     String toString(){
//         return "${this.name} is a man aged ${this.age} who lives at ${this.address}. He works for ${this.company} with employee id ${this.empid} and draws lots of money (${this.salary})."
//     }
// }

// Employee e = new Employee("Rishabh", 22, "Male", "Delhi", 1213, "Rxlogix", 999090)
// println e.toString()

// if([]){println "test 1 evaluated to true!"}
// if(["true"]){println "test 2 evaluated to true!"}
// if(["true","false"]){println "test 3 evaluated to true!"}
// if(0){println "test 4 evaluated to true!"}
// if(1){println "test 5 evaluated to true!"}
// if(false){println "test 6 evaluated to true!"}
// if(true){println "test 7 evaluated to true!"}

// class HourMinute {
//     Integer hour
//     Integer minute
    
//     HourMinute minus(HourMinute h){
//         Integer total = (this.hour*60+this.minute)-(h.hour*60+h.minute)
//         return new HourMinute(hour:total/60, minute:total%60)
//     }

//     HourMinute plus(HourMinute h){
//         Integer total = (this.hour*60+this.minute)+(h.hour*60+h.minute)
//         return new HourMinute(hour:total/60, minute:total%60)
//     }

//     String toString(){
//         return "${this.hour}:${this.minute}"
//     }
// }

// HourMinute h1 = new HourMinute(hour:5, minute:15)
// HourMinute h2 = new HourMinute(hour:3, minute:55)
// HourMinute h3 = h1+h2
// HourMinute h4 = h1-h2
// println h1.toString()
// println h2.toString()
// println h3.toString()
// println h4.toString()

// for(i in 1..10){
//     print "${3*i} "
// }

// println "\n"
// def i=1
// 10.times{
//     print "${3*i++} " 
// }

// println "\n"
// [1,2,3,4,5,6,7,8,9,10].each{
//     print "${3*it} "
// }

// println "\n"

// def containsValue = {value,myList->
//     return {
//         -> myList.contains(value)
//     }
// }

// def cars = ["bmw", "lexus", "nissan"]
// def containsBMW = containsValue('bmw',cars)
// def containsMercedeze = containsValue('mercedeze',cars)

// if(containsMercedeze()) println "the list contains mercedeze!"
// else println "the list does not contain mercedeze!"

// if(containsBMW()) println "the list contains bmw!"
// else println "the list does not contain bmw!"

////q9
// import java.nio.file.Files
// import java.nio.file.Paths

// def inputDirPath = "/home/lt-rishabhr/Desktop/input/"
// def outputFilePath = "/home/lt-rishabhr/Desktop/output.txt"

// def inputFiles = new File(inputDirPath).listFiles().findAll { it.isFile()}

// def combinedContent = inputFiles.collect {
//     Files.readAllLines(Paths.get(it.getPath())).join("\n")
// }
// .join("\n")

// new File(outputFilePath).withWriter {
//     writer -> writer.write(combinedContent)
// }

////q10
// def inputFilePath = "/home/lt-rishabhr/Desktop/input.txt"
// def outputFilePath = "/home/lt-rishabhr/Desktop/output.txt"
// def oddLines = []
// new File(inputFilePath).withReader {reader->
//     int lineNum = 1
//     reader.eachLine {
//         line->
//         if(lineNum%2==1) {
//             oddLines << "${lineNum}: ${line}"
//         }
//         lineNum++
//     }
// }
// new File(outputFilePath).withWriter {
//     writer ->
//     oddLines.each {
//         line->
//         writer.write(line+"\n")
//     }
// }

////q11
// def inputFilePath = "/home/lt-rishabhr/Desktop/input.txt"
// def outputFilePath = "/home/lt-rishabhr/Desktop/output.txt"
// def outputString = ""

// new File(inputFilePath).withReader {
//     reader->
//     reader.eachLine {
//         line->
//         //remove all whitespaces and append it to the output string
//         outputString += line.replaceAll(/\s/,"")
//     }
// }

// new File(outputFilePath).withWriter {
//     writer->
//     writer.write(outputString)
// }


////q12
// def inputFilePath = "/home/lt-rishabhr/Pictures/cars/bmwe46.jpg"
// def outputFilePath = "/home/lt-rishabhr/Desktop/img-copy.jpg"

// def inputBytes = new File(inputFilePath).getBytes()
// new File(outputFilePath).setBytes()
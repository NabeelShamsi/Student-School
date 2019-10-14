create database Students;
use Students;
 
CREATE TABLE `School` (
  `schoolID` int NOT NULL,
  `schoolName` varchar(255),
  `numberOfStudents` int,
  PRIMARY KEY (`schoolID`)
);
 
CREATE TABLE `Student` (
  `studentID` int NOT NULL,
  `studentName` varchar(255),
  `schoolID` int NOT NULL,
   PRIMARY KEY (`studentID`),
  KEY `fk_schoolID` (`schoolID`),
  CONSTRAINT `fk_schoolID` FOREIGN KEY (`schoolID`) REFERENCES `School` (`schoolID`)
);
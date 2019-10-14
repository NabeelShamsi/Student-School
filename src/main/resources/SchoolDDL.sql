create database students;
use students;
 
CREATE TABLE `school` (
  `schoolID` int NOT NULL AUTO_INCREMENT,
  `schoolName` varchar(255),
  PRIMARY KEY (`schoolID`)
);
 
CREATE TABLE `student` (
  `studentID` int NOT NULL AUTO_INCREMENT,
  `studentName` varchar(255),
  `schoolID` int NOT NULL,
  PRIMARY KEY (`studentID`),
  KEY `fk_schoolID` (`schoolID`),
  CONSTRAINT `fk_schoolID` FOREIGN KEY (`schoolID`) REFERENCES `school` (`schoolID`)
);
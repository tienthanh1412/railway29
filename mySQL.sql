create database `Testing_System_Assignment_1`;
use `Testing_System_Assignment_1`;
create table `Department`(
DepartmentID   int,
DepartmentName varchar(50)
);
create table `Position`(
PositionID   int,
PositionName varchar(50)
);
create table `Account`(
AccountID    int,
email        varchar(50),
Username     varchar(50),
Fullname     varchar(50),
DepartmentID int,
PositionID   int,
createdate   date
);
create table `Group`(
groupID     int,
groupName   varchar(50),
CreatorID   int,
CreatorDate date
);
create table `GroupAccount`(
GroupID   int,
AccountID int,
JoinDate  date 
);
create table `TypeQuestion`(
TypeID   int,
TypeName varchar(50)
);
create table `CategoryQuestion`(
CategoryID   int,
CategoryName varchar(50)
);
create table `Question`(
QuestionID int,
Content    varchar(50),
CategoryID int,
TypeID     int,
CreatorID  int,
CreateDate date
);
create table `Answer`(
AnswerID    int,
Content     varchar(50),
QuestionID  int,
isCorrect   varchar(50)
);
create table `Exam`(
ExamID     int,
`Code`     varchar(50),
Title      varchar(50),
CategoryID int,
Duration   varchar(50),
CreatorID  int,
CreateDate date
);
create table `ExamQuestion`(
ExamID     int,
QuestionID int
);





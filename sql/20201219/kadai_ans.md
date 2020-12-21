1.studentstテーブルに	name(藤井サクラ)、school_id(3)を追加せよ

INSERT INTO students(name,school_id)
VALUES('藤井サクラ',3);

2.studentstテーブルの全てのデータを抽出せよ。

SELECT * FROM students;

3.subjectsテーブルにname(地理・歴史)を追加せよ

INSERT INTO subjects(name)
VALUES(地理・歴史);

4.subjectsテーブルの全てのデータを抽出せよ。

SELECT * FROM subjects;

5.studentstテーブルのschool_id=1以外のデータを抽出せよ。

SELECT * FROM students WHERE school_id <> 1

6.studentstテーブルのschool_id=7のデータを削除せよ。

DELETE FROM students WHERE id=7;

7.examsテーブルのstudent_id=1,subjects_id=1のscoreを66にせよ。

UPDATE exams SET score=66
WHERE student_id=1 AND subjects_id=1;

8.examsテーブルの日付を昇順に並べ替えよ。

SELECT * FROM exams
ORDER BY date asc;

9.studentsテーブル。名前に[木］が含まれる生徒を抽出せよ。

SELECT * FROM students
WHERE name LIKE '%木%';

10.全生徒数を抽出せよ。

SELECT count(*) FROM students;

11.examsテーブル。スコアの平均点を求めよ。

SELECT avg(score) FROM exams;

12.studentsとschoolsを内部結合。学校名と生徒名を表示せよ。

SELECT schools.name,students.name FROM students JOIN schools
ON students.school_id=schools.id


13.studentsとexamsを内部結合。試験を受けた生徒のidと名前を抽出。重複は除外する

SELECT DISTINCT students.id,name FROM students JOIN exams
ON students.id=exams.student_id;

14.subjectsとexamsを内部結合。科目ごとの平均点を求めよ。

SELECT name,avg(score) FROM subjects JOIN exams
ON subjects.id=exams.subjects_id
GROUP BY name;

15.schoolsとstudentsを内部結合。各学校の生徒数を求めよ。取得カラムは学校名と生徒数とする。

SELECT schools.name,count(students.id) FROM schools JOIN students
ON schools.id=students.school_id
GROUP BY schools.name;

16.studentsとexamsを内部結合。試験を受けた生徒の合計点を求め、降順に抽出せよ。取得カラムは生徒名と合計点とする。

SELECT name,sum(score) FROM students JOIN exams
ON students.id=exams.student_id
GROUP BY name
ORDER BY score DESC;

17.subjectsとexamsを内部結合。科目ごとの最高点を表示せよ。

SELECT name,max(score) FROM subjects JOIN exams
ON subjects.id=exams.subjects_id
GROUP BY name;

18.studentsとexamsを内部結合。試験を受けた生徒の名前と平均点を抽出。80点以上ならAランク、65点以上ならBランク、その他はCランクとし、項目名はランクとする。

SELECT name,avg(score) FROM students JOIN exams
GROUP BY name;

19.studentsとexamsを内部結合。試験を受けていない生徒のidと名前を抽出。

SELECT students.id,name FROM students JOIN exams
ON students.id=exams.student_id
WHERE students.id NOT IN(SELECT student_id FROM exams);






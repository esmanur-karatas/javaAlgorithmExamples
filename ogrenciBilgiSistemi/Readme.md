# Öğrenci Bilgi Sistemi

Bu proje, bir üniversite öğrencisinin kurs notlarını ve öğretmen bilgilerini yöneten bir sistem içerir. Üç temel sınıf vardır: Teacher (Öğretmen), Course (Ders) ve Student (Öğrenci).

## Teacher (Öğretmen) Sınıfı

Bu sınıf, öğretmen bilgilerini temsil eder.

## Özellikler:

name: Öğretmenin adı

mpno: Öğretmenin sicil numarası

branch: Öğretmenin branşı

## Course (Ders) Sınıfı

Bu sınıf, ders bilgilerini ve öğretmen ilişkilerini yönetir.

## Özellikler:

name: Dersin adı

code: Dersin kodu

prefix: Dersin ön eki

oralEffect: Sözlü notun ortalama üzerindeki etkisi yüzdesi

teacher: Dersi öğreten öğretmen

averageNote: Dersin ortalama notu

## Metotlar:

addTeacher(Teacher teacher): Dersin öğretmenini ekler

printTeacher(): Dersin öğretmenini ekrana yazdırır

Student (Öğrenci) Sınıfı

Bu sınıf, öğrenci bilgilerini ve kurs notlarını yönetir.

## Özellikler:

name: Öğrencinin adı

stuNo: Öğrencinin öğrenci numarası

course1, course2, course3: Öğrencinin aldığı kurslar

oralNote1, oralNote2, oralNote3: Öğrencinin sözlü notları

## Metotlar:

addBulkExamNote(double oralNote1, double examNote1, double oralNote2, double examNote2, double oralNote3, double examNote3): Öğrencinin kurs notlarını ekler ve ortalama notlarını hesaplar

printNote(): Öğrencinin notlarını ekrana yazdırır


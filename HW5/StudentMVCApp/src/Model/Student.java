package Model;

/** Класс, описывающий модель студента, являющегося наследником класса User */
public class Student extends User implements Comparable<Student> {
   /**
    * Уникальный идентификатор студента
    */
   private long studentID;

   /**
    * Создает новый объект класса типа Student с заданными параметрами.
    *
    * @param firstName  Имя студента.
    * @param secondName Фамилия студента.
    * @param age        Возраст студента.
    * @param studentID  Уникальный идентификатор студента.
    */
   public Student(String firstName, String secondName, int age, long studentID) {
      super(firstName, secondName, age);
      this.studentID = studentID;
   }

   /**
    * Возвращает уникальный идентификатор студента.
    *
    * @return Уникальный идентификатор студента.
    */
   public long getStudentID() {
      return studentID;
   }

   /**
    * Устанавливает уникальный идентификатор студента.
    *
    * @param studentID Уникальный идентификатор студента.
    */
   public void setStudentID(long studentID) {
      this.studentID = studentID;
   }

   /**
    * Возвращает строковое представление объекта типа Student.
    *
    * @return Строковое представление объекта.
    */
   @Override
   public String toString() {
      return "Student{"

            + "firstName=" + super.getFirstName()
            + ", secondName=" + super.getSecondName()
            + ", age=" + super.getAge() +
            ", studentID=" + studentID +
            '}';
   }

   /**
    * Сравнивает текущего студента с переданным, используя возраст и уникальный
    * идентификатор.
    *
    * @param o Студент, с которым нужно сравнить текущего студента.
    * @return 0, если студенты равны, -1, если текущий студент меньше переданного,
    *         и 1, если текущий студент больше переданного.
    */
   @Override
   public int compareTo(Student o) {

      System.out.println(super.getFirstName() + " - " + o.getFirstName());
      if (super.getAge() == o.getAge()) {
         if (this.studentID == o.studentID) {
            return 0;
         }
         if (this.studentID < o.studentID) {
            return -1;
         }
         return 1;
      }
      if (super.getAge() < o.getAge()) {
         return -1;
      }
      return 1;
   }
}
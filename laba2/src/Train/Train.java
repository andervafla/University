package Train;

/**
 * Клас для зберігання даних про Поїзди
 * @author Piznel Marian
 */

public class Train {
       String pointRecognition;
       int trainNumber;
       int stimeArrival;
       int mtimeArrival;
       int stimeSend;
       int mtimeSend;
       int general;
       int compartment;
       int plac;
       int luxe;

       public Train() {}

       /**
        * Конструктор з параметрами
        * @param pointRecognition
        * @param trainNumber
        * @param stimeArrival
        * @param mtimeArrival
        * @param stimeSend
        * @param mtimeArrival
        * @param general
        * @param compartment
        * @param plac
        * @param luxe
        */

       public Train(String pointRecognition, int trainNumber, int stimeArrival, int mtimeArrival, int stimeSend, int mtimeSend, int general, int compartment, int plac, int luxe) {
              this.pointRecognition = pointRecognition;
              this.trainNumber = trainNumber;
              this.stimeArrival = stimeArrival;
              this.mtimeArrival = mtimeArrival;
              this.stimeSend = stimeSend;
              this.mtimeSend = mtimeSend;
              this.general = general;
              this.compartment = compartment;
              this.plac = plac;
              this.luxe = luxe;
       }

       public String getPointRecognition() {
              return pointRecognition;
       }

       public void setPointRecognition(String pointRecognition) {
              this.pointRecognition = pointRecognition;
       }

       public int getTrainNumber() {
              return trainNumber;
       }

       public void setTrainNumber(int trainNumber) {
              this.trainNumber = trainNumber;
       }

       public int getStimeArrival() {
              return stimeArrival;
       }

       public void setStimeArrival(int stimeArrival) {
              this.stimeArrival = stimeArrival;
       }

       public int getMtimeArrival() {
              return mtimeArrival;
       }

       public void setMtimeArrival(int mtimeArrival) {
              this.mtimeArrival = mtimeArrival;
       }

       public int getStimeSend() {
              return stimeSend;
       }

       public void setStimeSend(int stimeSend) {
              this.stimeSend = stimeSend;
       }

       public int getMtimeSend() {
              return mtimeSend;
       }

       public void setMtimeSend(int mtimeSend) {
              this.mtimeSend = mtimeSend;
       }

       public int getGeneral() {
              return general;
       }

       public void setGeneral(int general) {
              this.general = general;
       }

       public int getCompartment() {
              return compartment;
       }

       public void setCompartment(int compartment) {
              this.compartment = compartment;
       }

       public int getPlac() {
              return plac;
       }

       public void setPlac(int plac) {
              this.plac = plac;
       }

       public int getLuxe() {
              return luxe;
       }

       public void setLuxe(int luxe) {
              this.luxe = luxe;
       }

       /**
        * Перевантажений метод toString
        * @return представлення об'єкта у String форматі
        */

       @Override
       public String toString() {
              return "pointRecognition=" + pointRecognition +
                      ",\ntrainNumber='" + trainNumber + '\'' +
                      ",\ntimeArrival='" + stimeArrival +":"+ mtimeArrival+'\'' +
                      ",\ntimeSend='" + stimeSend +":"+ mtimeSend+'\'' +
                      ",\ngeneral='" + general + '\'' +
                      ",\ncompartment='" + compartment + '\'' +
                      ",\nplac='" + plac + '\'' +
                      ",\nluxe='" + luxe + "\n";

       }
}
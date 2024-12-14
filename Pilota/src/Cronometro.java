import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime, endTime;
    private int tempoGiro;
    public Cronometro() throws Exception {
        setStartTime();
        setEndTime();
    }
    public void setStartTime(){
        startTime = LocalTime.now();
    }
    public void setEndTime() throws Exception{
        endTime = LocalTime.now();
        calcolaIntTimer();
    }

    public int getTempoGiro() {
        return tempoGiro;
    }
    public void resetTimer() throws Exception{
        setStartTime();
        setEndTime();
    }

    private void calcolaIntTimer() throws Exception{
        int tempo;
        tempo = this.endTime.toSecondOfDay() - this.startTime.toSecondOfDay();
        if(tempo == 0){
            throw new Exception("Il cronometro è fermo");
        }
        this.tempoGiro = tempo;

    }
    @Override
    public String toString(){
        return String.format("TEMPO: %d", tempoGiro);
    }
}

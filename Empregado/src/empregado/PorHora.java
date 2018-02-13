package empregado;

import java.util.HashSet;
import java.util.Set;

public final class PorHora extends Empregado{

    private int horasTrabalhadas;
    private float valorHora;

    public PorHora(String n, String f, int horasTrabalhadas, float valorHora) {
        super(n, f);
        this.setHorasTrabalhadas(horasTrabalhadas);
        this.setValorHora(valorHora);
    }
    
    @Override
    public double ganha() {
        return horasTrabalhadas*valorHora;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveNotificarUmPaciente() {
        Medico medico = new Medico("Carlos", "Cardiologista");
        Paciente paciente = new Paciente("Paciente 1");
        paciente.iniciarTratamento(medico);
        medico.emitirExames();
        assertEquals("Paciente 1, exames emitidos por Medico{nome=Carlos, especializacao=Cardiologista}", paciente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPacientes() {
        Medico medico = new Medico("Carlos", "Cardiologista");
        Paciente paciente1 = new Paciente("Paciente 1");
        Paciente paciente2 = new Paciente("Paciente 2");
        paciente1.iniciarTratamento(medico);
        paciente2.iniciarTratamento(medico);
        medico.emitirExames();
        assertEquals("Paciente 1, exames emitidos por Medico{nome=Carlos, especializacao=Cardiologista}", paciente1.getUltimaNotificacao());
        assertEquals("Paciente 2, exames emitidos por Medico{nome=Carlos, especializacao=Cardiologista}", paciente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarPaciente() {
        Medico medico = new Medico("Carlos", "Cardiologista");
        Paciente paciente = new Paciente("Paciente 1");
        medico.emitirExames();
        assertEquals(null, paciente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPacienteMedicoUm() {
        Medico medico1 = new Medico("Carlos", "Cardiologista");
        Medico medico2 = new Medico("Jose", "Oftamologista");
        Paciente paciente1 = new Paciente("Paciente 1");
        Paciente paciente2 = new Paciente("Paciente 2");
        paciente1.iniciarTratamento(medico1);
        paciente2.iniciarTratamento(medico2);
        medico1.emitirExames();
        assertEquals("Paciente 1, exames emitidos por Medico{nome=Carlos, especializacao=Cardiologista}", paciente1.getUltimaNotificacao());
        assertEquals(null, paciente2.getUltimaNotificacao());
    }



}
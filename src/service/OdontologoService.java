package service;

import dao.OdontologoDAOH2;
import dao.OdontologoDAOList;
import dao.PacienteDAOH2;
import dao.iDao;
import model.Odontologo;
import model.Paciente;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;
    private iDao<Odontologo> odontologoiDaoList;

    public OdontologoService() {
        odontologoiDao= new OdontologoDAOH2();
        odontologoiDaoList = new OdontologoDAOList();
    }
    //metodos manuales
    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }
    public List<Odontologo> buscarTodos(){
        return odontologoiDao.buscarTodos();
    }
    public Odontologo guardarOdontologoEnLista(Odontologo odontologo){
        return odontologoiDaoList.guardar(odontologo);
    }
    public List<Odontologo> buscarTodosEnLista(){
        return odontologoiDaoList.buscarTodos();
    }
}

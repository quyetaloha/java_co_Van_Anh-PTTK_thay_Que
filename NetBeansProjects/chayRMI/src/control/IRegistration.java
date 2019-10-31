/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Answer;
import model.Student;

/**
 *
 * @author Hoang Quyet
 */
public interface IRegistration extends Remote{
    Student register(Student s) throws RemoteException;
    Answer answer(Answer s) throws RemoteException;
    int layport1(Student s) throws RemoteException;
    int layport2(Student s) throws RemoteException;
}

package Exceções;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.Query;

public class Exemplo002 {
    //Exceção esperada

    try {
        PreparedStatement stmt = con.PreparedStatement(query);
    } catch (SQLException e) {
        throw new acessoDeDadosException("Problema na criação do Statement", e);
    }
}

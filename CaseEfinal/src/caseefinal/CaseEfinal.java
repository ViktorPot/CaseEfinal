/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseefinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Viktor
 */
public class CaseEfinal {

    static int[][] roster;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ENTER DEP LETTER (A,B,C,D)");
        Department d = Read.readAll("files/depA.xlsx", "A");
//Heuristic.generateRoster();
//Heuristic.generateRoster20Shifts();
        Heuristic.generateRosterOneShiftPerDay20Shifts();
        //roster = Heuristic.heuristic(d);

        Print.printRoster(roster, "files/FormatDepA.xlsx");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGraficas;

import java.awt.*;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.GridPane;
import javax.swing.*;

/**
 *
 * @author User
 */
public class graficoTorta extends JPanel{
    JFXPanel fxPanel;
    String[] labels;
    int[] values;
    String[] id_Title;
    
    public graficoTorta(String[] etiquetas, int[] valores, String[] identificadores){
        labels = etiquetas;
        values = valores;
        id_Title = identificadores;
        initSwingComponents();
        initJavaFxComponents();
    }
    
    public void initSwingComponents() {
        JPanel containerPie = new JPanel(new BorderLayout());
        fxPanel = new JFXPanel();
        containerPie.add(fxPanel, BorderLayout.CENTER);
        this.add(containerPie);
        this.setSize(950,700);
    }

    public void initJavaFxComponents() {
        Platform.runLater(new Runnable()
        {
            @Override
            public void run(){
                GridPane grid = new GridPane();
                Scene scene = new Scene(grid, 950, 700);
                //ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(getdata());
                
                int tam = values.length;
                
                if(tam == 2){
                    
                    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data(labels[0], values[0]), new PieChart.Data(labels[1], values[1]));
                    PieChart chart = new PieChart(pieChartData);
                    chart.setTitle(id_Title[0]);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(chart,5,3);
                    fxPanel.setScene(scene);   
                }
                if(tam == 3){
                    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data(labels[0], values[0]), 
                            new PieChart.Data(labels[1], values[1]), 
                            new PieChart.Data(labels[2], values[2]));
                    PieChart chart = new PieChart(pieChartData);
                    chart.setTitle(id_Title[0]);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(chart,5,3);
                    fxPanel.setScene(scene);   
                    
                }
                if(tam == 9){
                    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data(labels[0], values[0]), 
                            new PieChart.Data(labels[1], values[1]), 
                            new PieChart.Data(labels[2], values[2]),
                            new PieChart.Data(labels[3], values[3]),
                            new PieChart.Data(labels[4], values[4]),
                            new PieChart.Data(labels[5], values[5]),
                            new PieChart.Data(labels[6], values[6]),
                            new PieChart.Data(labels[7], values[7]),
                            new PieChart.Data(labels[8], values[8]));
                    PieChart chart = new PieChart(pieChartData);
                    chart.setTitle(id_Title[0]);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(chart,5,3);
                    fxPanel.setScene(scene);   
                }
                if(tam == 14){
                    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data(labels[0], values[0]), 
                            new PieChart.Data(labels[1], values[1]), 
                            new PieChart.Data(labels[2], values[2]),
                            new PieChart.Data(labels[3], values[3]),
                            new PieChart.Data(labels[4], values[4]),
                            new PieChart.Data(labels[5], values[5]),
                            new PieChart.Data(labels[6], values[6]),
                            new PieChart.Data(labels[7], values[7]),
                            new PieChart.Data(labels[8], values[8]),
                            new PieChart.Data(labels[9], values[9]),
                            new PieChart.Data(labels[10], values[10]),
                            new PieChart.Data(labels[11], values[11]),
                            new PieChart.Data(labels[12], values[12]),
                            new PieChart.Data(labels[13], values[13]));
                    PieChart chart = new PieChart(pieChartData);
                    chart.setTitle(id_Title[0]);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(chart,5,3);
                    fxPanel.setScene(scene);   
                    
                }
                if(tam == 18){
                    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data(labels[0], values[0]), 
                            new PieChart.Data(labels[1], values[1]), 
                            new PieChart.Data(labels[2], values[2]),
                            new PieChart.Data(labels[3], values[3]),
                            new PieChart.Data(labels[4], values[4]),
                            new PieChart.Data(labels[5], values[5]),
                            new PieChart.Data(labels[6], values[6]),
                            new PieChart.Data(labels[7], values[7]),
                            new PieChart.Data(labels[8], values[8]),
                            new PieChart.Data(labels[9], values[9]),
                            new PieChart.Data(labels[10], values[10]),
                            new PieChart.Data(labels[11], values[11]),
                            new PieChart.Data(labels[12], values[12]),
                            new PieChart.Data(labels[13], values[13]),
                            new PieChart.Data(labels[14], values[14]),
                            new PieChart.Data(labels[15], values[15]),
                            new PieChart.Data(labels[16], values[16]),
                            new PieChart.Data(labels[17], values[17]));
                    PieChart chart = new PieChart(pieChartData);
                    chart.setTitle(id_Title[0]);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(chart,5,3);
                    fxPanel.setScene(scene);     
                }
                if(tam == 6){
                    ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data(labels[0], values[0]), 
                            new PieChart.Data(labels[1], values[1]), 
                            new PieChart.Data(labels[2], values[2]),
                            new PieChart.Data(labels[3], values[3]),
                            new PieChart.Data(labels[4], values[4]),
                            new PieChart.Data(labels[5], values[5]));
                    PieChart chart = new PieChart(pieChartData);
                    chart.setTitle(id_Title[0]);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(chart,5,3);
                    fxPanel.setScene(scene);   
                }
                
                
            }
        });
    }
    
    public PieChart.Data getdata(){
       

        PieChart.Data serie = null;

        
        for(int i = 0; i < values.length; i++){
       
                
                serie = new PieChart.Data(labels[i], values[i]);
        



        }
        
        return serie;
    }
}
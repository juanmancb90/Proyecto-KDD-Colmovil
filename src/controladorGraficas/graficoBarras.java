/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorGraficas;

import java.awt.BorderLayout;
import java.util.Arrays;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class graficoBarras extends JPanel
{
    JFXPanel fxPanel;
    String[] nombreDatosSerie;
    int[] valoresSerie;
    String tituloGrafico;
    
    //constructor
    public graficoBarras(String title, String[] label, int[] valor)
    {
        System.out.println("entrando a constructor de la clase grafico de barras");
        tituloGrafico = title;
        nombreDatosSerie = label;
        valoresSerie = valor;
        
        initSwingComponents();
        initFxComponents();
    }
    
    //funcion que iniciliza los componentes swing para mostra el grafico en la interfaz 
    public void initSwingComponents()
    {
        JPanel mainPanel = new JPanel(new BorderLayout());
        fxPanel = new JFXPanel();
        mainPanel.add(fxPanel, BorderLayout.CENTER);
        this.add(mainPanel);
        this.setSize(950,650);
    }
    
    //funcion que permite hacer el graficos barras javaFX
    public void initFxComponents(){
        Platform.runLater(new Runnable() 
        {
            @Override
            public void run() {
                
                //definir el gridpane donde se hara el grafico
                GridPane grid = new GridPane();
                Scene scene = new Scene(grid, 950, 650);
                
                //Definir propiedades del grafico nombre etiquetas de los datos, creacion de ejex x y, creacion del objeto barchart
                String[] etiquetaSerie = nombreDatosSerie; //<-define las nombres o categorias  de la series en el eje x 
                
                CategoryAxis ejeX = new CategoryAxis();
                
                NumberAxis ejeY = new NumberAxis();
               
                //yAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(yAxis,"$",null)); <-define el formato del eje y
                
                final BarChart<String,Number> graficoBarras = new BarChart<String,Number>(ejeX,ejeY);


                // Configurar el grafico: se le define un nombre, se agregan las categorias para la serie a representar
                graficoBarras.setTitle(tituloGrafico);
                
                //ejeX.setLabel("Year");<-define un nombre para el eje x
                
                //definicion de las categorias o nombres de los datos
                ejeX.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(etiquetaSerie)));

                
                //ejeY.setLabel("Price");<-Define un nombre para el eje y
                
               
                // Agregar datos a la series que se desea representar
                XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series4 = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series5 = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series6 = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series7 = new XYChart.Series<String,Number>();
                XYChart.Series<String,Number> series8 = new XYChart.Series<String,Number>();
    
                
                //definir los nombres para cada dato
                
                int t = valoresSerie.length;
               
                if(t == 2){
                    for(int i = 0; i < valoresSerie.length; i++){
                        if(i == 0){
                            series.setName(etiquetaSerie[i]);
                            series.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 1){
                            series1.setName(etiquetaSerie[i]);
                            series1.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                    }
                    graficoBarras.getData().add(series);
                    graficoBarras.getData().add(series1);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(graficoBarras,5,3);
                    fxPanel.setScene(scene);
                }
                if(t == 3)
                {
                     for(int i = 0; i < valoresSerie.length; i++){
                        if(i == 0){
                            series.setName(etiquetaSerie[i]);
                            series.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 1){
                            series1.setName(etiquetaSerie[i]);
                            series1.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 2){
                            series2.setName(etiquetaSerie[i]);
                            series2.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                    }
                    graficoBarras.getData().add(series);
                    graficoBarras.getData().add(series1);
                    graficoBarras.getData().add(series2);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(graficoBarras,5,3);
                    fxPanel.setScene(scene);
                    
                }
                if(t == 9)
                {
                     for(int i = 0; i < valoresSerie.length; i++){
                        if(i == 0){
                            series.setName(etiquetaSerie[i]);
                            series.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 1){
                            series1.setName(etiquetaSerie[i]);
                            series1.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 2){
                            series2.setName(etiquetaSerie[i]);
                            series2.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 3){
                            series3.setName(etiquetaSerie[i]);
                            series3.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 4){
                            series4.setName(etiquetaSerie[i]);
                            series4.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 5){
                            series5.setName(etiquetaSerie[i]);
                            series5.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 6){
                            series6.setName(etiquetaSerie[i]);
                            series6.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 7){
                            series7.setName(etiquetaSerie[i]);
                            series7.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 8){
                            series8.setName(etiquetaSerie[i]);
                            series8.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                    }
                    graficoBarras.getData().addAll(series,series1,series2,series3,series4,series5,series6,series7,series8);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(graficoBarras,5,3);
                    fxPanel.setScene(scene);
                    
                }
                if(t == 6)
                {
                     for(int i = 0; i < valoresSerie.length; i++){
                        if(i == 0){
                            series.setName(etiquetaSerie[i]);
                            series.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 1){
                            series1.setName(etiquetaSerie[i]);
                            series1.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 2){
                            series2.setName(etiquetaSerie[i]);
                            series2.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 3){
                            series3.setName(etiquetaSerie[i]);
                            series3.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 4){
                            series4.setName(etiquetaSerie[i]);
                            series4.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                        if(i == 5){
                            series5.setName(etiquetaSerie[i]);
                            series5.getData().add(new XYChart.Data<String,Number>(etiquetaSerie[i], valoresSerie[i]));
                        }
                    }
                    graficoBarras.getData().addAll(series,series1,series2,series3,series4,series5);
                    grid.setVgap(20);
                    grid.setHgap(20);
                    grid.add(graficoBarras,5,3);
                    fxPanel.setScene(scene);
     
                }  
            }
        });
    }
    
    /*XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
    series2.setName("Data Series 2");
    XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
    series3.setName("Data Series 3");
    series1.getData().add(new XYChart.Data<String,Number>(years[1], 1292));
    series1.getData().add(new XYChart.Data<String,Number>(years[2], 2180));
    series2.getData().add(new XYChart.Data<String,Number>(years[0], 956));
    series2.getData().add(new XYChart.Data<String,Number>(years[1], 1665));
    series2.getData().add(new XYChart.Data<String,Number>(years[2], 2450));
    series3.getData().add(new XYChart.Data<String,Number>(years[0], 800));
    series3.getData().add(new XYChart.Data<String,Number>(years[1], 1000));
    series3.getData().add(new XYChart.Data<String,Number>(years[2], 2800));
    bc.getData().add(series2);
    bc.getData().add(series3);
    */
}
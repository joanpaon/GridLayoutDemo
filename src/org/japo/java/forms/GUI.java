/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends JFrame {

    // Propiedades App
    public static final String PRP_LOOK_AND_FEEL = "look_and_feel";
    public static final String PRP_FAVICON = "favicon";

    // Valores por Defecto
    public static final String DEF_LOOK_AND_FEEL = UtilesSwing.LNF_NIMBUS;
    public static final String DEF_FAVICON = "img/favicon.png";

    // Referencias
    private Properties prp;
    private JLabel lblEne;
    private JLabel lblFeb;
    private JLabel lblMar;
    private JLabel lblAbr;
    private JLabel lblMay;
    private JLabel lblJun;

    // Constructor
    public GUI(Properties prp) {
        // Inicialización Anterior
        initBefore(prp);

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    // Construcción - GUI
    private void initComponents() {
        // Etiqueta Enero
        lblEne = new JLabel("Enero");
        lblEne.setHorizontalAlignment(JLabel.CENTER);
        lblEne.setFont(new Font("Beatnik SF", Font.PLAIN, 50));
        lblEne.setOpaque(true);
        lblEne.setForeground(Color.WHITE);
        lblEne.setBackground(Color.BLUE);
        
        // Etiqueta Febrero
        lblFeb = new JLabel("Febrero");
        lblFeb.setHorizontalAlignment(JLabel.CENTER);
        lblFeb.setFont(new Font("Beatnik SF", Font.PLAIN, 50));
        lblFeb.setOpaque(true);
        lblFeb.setForeground(Color.WHITE);
        lblFeb.setBackground(Color.RED);
        
        // Etiqueta Marzo
        lblMar = new JLabel("Marzo");
        lblMar.setHorizontalAlignment(JLabel.CENTER);
        lblMar.setFont(new Font("Beatnik SF", Font.PLAIN, 50));
        lblMar.setOpaque(true);
        lblMar.setForeground(Color.WHITE);
        lblMar.setBackground(Color.MAGENTA);
        
        // Etiqueta Abril
        lblAbr = new JLabel("Abril");
        lblAbr.setHorizontalAlignment(JLabel.CENTER);
        lblAbr.setFont(new Font("Beatnik SF", Font.PLAIN, 50));
        lblAbr.setOpaque(true);
        lblAbr.setForeground(Color.WHITE);
        lblAbr.setBackground(Color.ORANGE);
        
        // Etiqueta Mayo
        lblMay = new JLabel("Mayo");
        lblMay.setHorizontalAlignment(JLabel.CENTER);
        lblMay.setFont(new Font("Beatnik SF", Font.PLAIN, 50));
        lblMay.setOpaque(true);
        lblMay.setForeground(Color.WHITE);
        lblMay.setBackground(Color.PINK);

        // Etiqueta Junio
        lblJun = new JLabel("Junio");
        lblJun.setHorizontalAlignment(JLabel.CENTER);
        lblJun.setFont(new Font("Beatnik SF", Font.PLAIN, 50));
        lblJun.setOpaque(true);
        lblJun.setForeground(Color.WHITE);
        lblJun.setBackground(Color.CYAN);
        
        // Panel Principal
        JPanel pnlPpal = new JPanel();
        pnlPpal.setLayout(new GridLayout(2, 3));
        pnlPpal.add(lblEne);
        pnlPpal.add(lblFeb);
        pnlPpal.add(lblMar);
        pnlPpal.add(lblAbr);
        pnlPpal.add(lblMay);
        pnlPpal.add(lblJun);
        
        // Ventana Principal
        setContentPane(pnlPpal);
        setTitle("GridLayout Demo");
//        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Inicialización Anterior    
    private void initBefore(Properties prp) {
        // Memorizar Referencia
        this.prp = prp;

        // Establecer LnF
        UtilesSwing.establecerLnF(prp.getProperty(PRP_LOOK_AND_FEEL, DEF_LOOK_AND_FEEL));
    }

    // Inicialización Anterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty(PRP_FAVICON, DEF_FAVICON));
    }
}

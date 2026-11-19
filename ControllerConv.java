package com.lina;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.AudioClip;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;


public class ControllerConv {

    // =======================================================
    // 1. ONGLET MONNAIE 
    // =======================================================
    @FXML private TextField ChampMontantM;
    @FXML private Label labelM;
    @FXML private ComboBox<String> boxdeM;
    @FXML private ComboBox<String> boxversM;

    // =======================================================
    // 2. ONGLET DISTANCE 
    // =======================================================
    @FXML private TextField ChampMontantD;
    @FXML private Label labelD;
    @FXML private ComboBox<String> boxdeD;
    @FXML private ComboBox<String> boxversD;

    // =======================================================
    // 3. ONGLET TEMPÉRATURE 
    // =======================================================
    @FXML private TextField ChampMontantTemp;
    @FXML private Label labelTemp;
    @FXML private ComboBox<String> boxdeTemp;
    @FXML private ComboBox<String> boxversTemp;

    // =======================================================
    // 4. ONGLET SURFACE
    // =======================================================
    @FXML private TextField ChampMontantSu;
    @FXML private Label labelSu;
    @FXML private ComboBox<String> boxdeSu;
    @FXML private ComboBox<String> boxversSu;

    // =======================================================
    // 5. ONGLET VOLUME
    // =======================================================
    @FXML private TextField ChampMontantVol;
    @FXML private Label labelVol;
    @FXML private ComboBox<String> boxdeVol;
    @FXML private ComboBox<String> boxversVol;

    // =======================================================
    // 6. ONGLET TEMPS
    // =======================================================
    @FXML private TextField ChampMontantT;
    @FXML private Label labelT;
    @FXML private ComboBox<String> boxdeT;
    @FXML private ComboBox<String> boxversT;

    // =======================================================
    // 7. ONGLET VITESSE
    // =======================================================
    @FXML private TextField ChampMontantV;
    @FXML private Label labelV;
    @FXML private ComboBox<String> boxdeV;
    @FXML private ComboBox<String> boxversV; 
    
    // =======================================================
    // 8. ONGLET POIDS
    // =======================================================
    @FXML private TextField ChampMontantP;
    @FXML private Label labelP;
    @FXML private ComboBox<String> boxdeP;
    @FXML private ComboBox<String> boxversP;

    // =======================================================
    // 9. ONGLET STOCKAGE
    // =======================================================
    @FXML private TextField ChampMontantS;
    @FXML private Label labelS;
    @FXML private ComboBox<String> boxdeS;
    @FXML private ComboBox<String> boxversS;

    // =======================================================
    // 10. ONGLET BINAIRE / HEXA
    // =======================================================
    @FXML private TextField ChampMontantBH;
    @FXML private Label labelBH;
    @FXML private ComboBox<String> boxdeBH;
    @FXML private ComboBox<String> boxversBH;


    // =======================================================
    // INITIALISATION
    // =======================================================
    @FXML
    public void initialize() {
        
        // SETUP MONNAIE
        if (boxdeM != null && boxversM != null) {
            boxdeM.getItems().addAll("Euro", "Dollar", "Livre");
            boxdeM.setValue("Euro");
            boxversM.getItems().addAll("Euro", "Dollar", "Livre");
            boxversM.setValue("Dollar");
        }
        if (ChampMontantM != null) {
            ChampMontantM.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantM.selectAll());
            });
        }

        // SETUP DISTANCE
        if (boxdeD != null && boxversD != null) {
            boxdeD.getItems().addAll("km", "m", "dm", "cm", "mm");
            boxdeD.setValue("km");
            boxversD.getItems().addAll("km", "m", "dm", "cm", "mm");
            boxversD.setValue("m");
        }
        if (ChampMontantD != null) {
            ChampMontantD.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantD.selectAll());
            });
        }

        // SETUP TEMPÉRATURE
        if (boxdeTemp != null && boxversTemp != null) {
            boxdeTemp.getItems().addAll("Celsius", "Fahrenheit");
            boxdeTemp.setValue("Celsius");
            boxversTemp.getItems().addAll("Celsius", "Fahrenheit");
            boxversTemp.setValue("Fahrenheit");
        }
        if (ChampMontantTemp != null) {
            ChampMontantTemp.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantTemp.selectAll());
            });
        }

        // SETUP SUPERFICIE
        if (boxdeSu != null && boxversSu != null) {
            boxdeSu.getItems().addAll("m²", "cm²", "mm²", "km²", "Hectare");
            boxdeSu.setValue("m²");
            boxversSu.getItems().addAll("m²", "cm²", "mm²", "km²", "Hectare");
            boxversSu.setValue("Hectare");
        }
        if (ChampMontantSu != null) {
            ChampMontantSu.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantSu.selectAll());
            });
        }

        // SETUP VOLUME
        if (boxdeVol != null && boxversVol != null) {
            boxdeVol.getItems().addAll("m³", "dm³", "cm³", "mm³", "L", "mL");
            boxdeVol.setValue("m³");
            boxversVol.getItems().addAll("m³", "dm³", "cm³", "mm³", "L", "mL");
            boxversVol.setValue("L");
        }
        if (ChampMontantVol != null) {
            ChampMontantVol.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantVol.selectAll());
            });
        }

        // SETUP TEMPS
        if (boxdeT != null && boxversT != null) {
            boxdeT.getItems().addAll("Seconde", "Minute", "Heure");
            boxdeT.setValue("seconde");
            boxversT.getItems().addAll("Seconde", "Minute", "Heure");
            boxversT.setValue("Minute");
        } 
        if (ChampMontantT != null) {
            ChampMontantT.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantT.selectAll());
            });
        }
        
        // SETUP VITESSE
        if (boxdeV != null && boxversV != null) {   
            boxdeV.getItems().addAll("m/s", "km/h", "mph");
            boxdeV.setValue("m/s");
            boxversV.getItems().addAll("m/s", "km/h", "mph");
            boxversV.setValue("km/h");
        }
        if (ChampMontantV != null) {
            ChampMontantV.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantV.selectAll());
            });
        }
        // SETUP POIDS
        if (boxdeP != null && boxversP != null) {
            boxdeP.getItems().addAll("kg", "g", "mg", "Tonne", "Livre (lb)", "Once (oz)");
            boxdeP.setValue("kg");
            boxversP.getItems().addAll("kg", "g", "mg", "Tonne", "Livre (lb)", "Once (oz)");
            boxversP.setValue("Livre (lb)");
        }
        if (ChampMontantP != null) {
            ChampMontantP.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantP.selectAll());
            });
        }

        // SETUP STOCKAGE
        if (boxdeS != null && boxversS != null) {
            boxdeS.getItems().addAll("Octet", "Ko", "Mo", "Go", "To");
            boxdeS.setValue("Mo");
            boxversS.getItems().addAll("Octet", "Ko", "Mo", "Go", "To");
            boxversS.setValue("Go");
        }
        if (ChampMontantS != null) {
            ChampMontantS.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantS.selectAll());
            });
        }

        // SETUP BINAIRE/HEXA
        if (boxdeBH != null && boxversBH != null) {
            boxdeBH.getItems().addAll("Décimal", "Binaire", "Hexadécimal");
            boxdeBH.setValue("Décimal");
            boxversBH.getItems().addAll("Décimal", "Binaire", "Hexadécimal");
            boxversBH.setValue("Binaire");
        }
        if (ChampMontantBH != null) {
            ChampMontantBH.focusedProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal) Platform.runLater(() -> ChampMontantBH.selectAll());
            });
        }
    }

    // =======================================================
    // OUTILS
    // =======================================================
    private void jouerSon() {
        try {
            var resource = getClass().getResource("/success.mp3");
            if (resource != null) {
                new AudioClip(resource.toExternalForm()).play();
            }
        } catch (Exception e) {
            System.out.println("Erreur son : " + e.getMessage());
        }
    }

    // Méthode pour les virgules, les points et les espaces en trop
    private double lireMontant(TextField champ) throws NumberFormatException {
        String texte = champ.getText();
        if (texte == null) return 0;
        // remplace , par .
        texte = texte.replace(',', '.').trim();
        return Double.parseDouble(texte);
    }

    // =======================================================
    // INVERSION DES UNITÉS
    // =======================================================
    @FXML
    private void inverserMonnaie() {
        // 1. stock la valeur
        String temp = boxdeM.getValue();
        // 2. échange
        boxdeM.setValue(boxversM.getValue());
        boxversM.setValue(temp);
        // 3. relance le calcul
        convertirMonnaie();
    }

    @FXML
    private void inverserDistance() {
        String temp = boxdeD.getValue();
        boxdeD.setValue(boxversD.getValue());
        boxversD.setValue(temp);
        convertirDistance();
    }

    @FXML
    private void inverserTempérature() {
        String temp = boxdeTemp.getValue();
        boxdeTemp.setValue(boxversTemp.getValue());
        boxversTemp.setValue(temp);
        convertirTempérature();
    }

    @FXML
    private void inverserSurface() {
        String temp = boxdeSu.getValue();
        boxdeSu.setValue(boxversSu.getValue());
        boxversSu.setValue(temp);
        convertirSurface();
    }

    @FXML
    private void inverserVolume() {
        String temp = boxdeVol.getValue();
        boxdeVol.setValue(boxversVol.getValue());
        boxversVol.setValue(temp);
        convertirVolume();
    }

    @FXML
    private void inverserTemps() {
        String temp = boxdeT.getValue();
        boxdeT.setValue(boxversT.getValue());
        boxversT.setValue(temp);
        convertirTemps();
    }

    @FXML
    private void inverserVitesse() {
        String temp = boxdeV.getValue();
        boxdeV.setValue(boxversV.getValue());
        boxversV.setValue(temp);
        convertirVitesse();
    }

    @FXML
    private void inverserPoids() {
        String temp = boxdeP.getValue();
        boxdeP.setValue(boxversP.getValue());
        boxversP.setValue(temp);
        convertirPoids();
    }

    @FXML
    private void inverserStockage() {
        String temp = boxdeS.getValue();
        boxdeS.setValue(boxversS.getValue());
        boxversS.setValue(temp);
        convertirStockage();
    }

    @FXML
    private void inverserBinaireHexa() {
        String temp = boxdeBH.getValue();
        boxdeBH.setValue(boxversBH.getValue());
        boxversBH.setValue(temp);
        convertirBinaire();
    }


    // =======================================================
    // FACTEURS DE CONVERSION (méthodes utilitaires)
    // =======================================================
    
    // Pivot : Mètre (m)
    private double getFactorDistance(String unit) {
        if (unit == null) return 1;
        switch(unit) {
            case "km": return 1000.0;
            case "m":  return 1.0;
            case "dm": return 0.1;
            case "cm": return 0.01;
            case "mm": return 0.001;
            default:   return 1.0;
        }
    }

    // Pivot : Mètre Carré (m²)
    private double getFactorSurface(String unit) {
        if (unit == null) return 1;
        switch(unit) {
            case "km²": return 1_000_000.0;
            case "m²":  return 1.0;
            case "Hectare": return 10_000.0;
            case "cm²": return 0.0001;
            case "mm²": return 0.000001;
            default:    return 1.0;
        }
    }

    // Pivot : Mètre Cube (m³)
    private double getFactorVolume(String unit) {
        if (unit == null) return 1;
        switch(unit) {
            case "m³":  return 1.0;
            case "dm³": return 0.001;
            case "cm³": return 0.000001;
            case "mm³": return 0.000000001;
            case "L":   return 0.001;
            case "mL":  return 0.000001;
            default:    return 1.0;
        }
    }

    // Pivot : Gramme (g)
    private double getFactorPoids(String unit) {
        if (unit == null) return 1;
        switch(unit) {
            case "Tonne": return 1_000_000.0;
            case "kg":    return 1000.0;
            case "g":     return 1.0;
            case "mg":    return 0.001;
            case "Livre (lb)": return 453.592;
            case "Once (oz)":  return 28.3495;
            default:      return 1.0;
        }
    }

    // Pivot : Octet
    private double getFactorStockage(String unit) {
        if (unit == null) return 1;
        switch(unit) {
            case "To":    return 1024.0 * 1024 * 1024 * 1024;
            case "Go":    return 1024.0 * 1024 * 1024;
            case "Mo":    return 1024.0 * 1024;
            case "Ko":    return 1024.0;
            case "Octet": return 1.0;
            default:      return 1.0;
        }
    }

    // =======================================================
    // CONVERSIONS
    // =======================================================

    @FXML
    private void convertirMonnaie() {
        if (ChampMontantM.getText().isEmpty()) {
        labelM.setText("Entrez une valeur"); 
        return;
    }
        try {
            double montant = lireMontant(ChampMontantM);
            String de = boxdeM.getValue();
            String vers = boxversM.getValue();

            if (de.equals(vers)) {
                labelM.setText(String.format("%.2f %s", montant, vers));
                return;
            }

            // Traduction en ISO
            String isoFrom = getCodeIso(de);
            String isoTo = getCodeIso(vers);

            // URL de Frankfurter
String url = String.format("https://api.frankfurter.app/latest?amount=%f&from=%s&to=%s", montant, isoFrom, isoTo);

            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                labelM.setText("Erreur réseau");
                return;
            }

            String body = response.body();
            JsonObject json = JsonParser.parseString(body).getAsJsonObject();

            // Au lieu de "resultat" c'est dans rates -> {Devise}
            if (json.has("rates")) {
                double resultat = json.getAsJsonObject("rates").get(isoTo).getAsDouble();
                labelM.setText(String.format("%.2f %s", resultat, vers));
            } else {
                labelM.setText("Erreur API");
            }
            
            jouerSon();
            boxdeM.requestFocus();

        } catch (NumberFormatException nfe) {
            labelM.setText("Montant invalide");
        } catch (Exception e) {
            labelM.setText("Erreur");
            e.printStackTrace();
        }
    }
    // Traduction des devises en code ISO pour Frankfurter
    private String getCodeIso(String nom) {
        if (nom == null) return "EUR";
        
        switch (nom) {
            case "Euro": return "EUR";
            case "Dollar": return "USD";
            case "Livre": return "GBP";
            default: return "EUR";
        }
    }

    @FXML
    private void convertirDistance() {
            if (ChampMontantD.getText().isEmpty()) {
        labelD.setText("Entrez une valeur");
        return;
    }
        try {
            double montant = lireMontant(ChampMontantD);
            String de = boxdeD.getValue();
            String vers = boxversD.getValue();

            double facteurDe = getFactorDistance(de);
            double facteurVers = getFactorDistance(vers);
            double resultat = montant * facteurDe / facteurVers;

            labelD.setText(String.format("%.4f %s", resultat, vers));
            jouerSon();
            boxdeD.requestFocus();
        } catch (Exception e) {
            labelD.setText("Erreur");
        }
    }

    @FXML
    public void convertirTempérature() {
        if (ChampMontantTemp.getText().isEmpty()) {
        labelTemp.setText("Entrez une valeur");
        return;
    }
        try {
            double value = lireMontant(ChampMontantTemp);
            String de = boxdeTemp.getValue();
            String vers = boxversTemp.getValue();
            double resultat = value;

            if (de.equals("Celsius") && vers.equals("Fahrenheit")) {
                resultat = (value * 9 / 5) + 32; 
            } else if (de.equals("Fahrenheit") && vers.equals("Celsius")) {
                resultat = (value - 32) * 5 / 9;
            }

            labelTemp.setText(String.format("%.2f %s", resultat, vers));
            jouerSon();
            boxdeTemp.requestFocus();
        } catch (Exception e) {
            labelTemp.setText("Entrée invalide");
        }
    }

    @FXML
    public void convertirSurface() {
        if (ChampMontantSu.getText().isEmpty()) {
        labelSu.setText("Entrez une valeur");
        return;
    }
        try {
            double value = lireMontant(ChampMontantSu);
            String de = boxdeSu.getValue();
            String vers = boxversSu.getValue();

            double facteurDe = getFactorSurface(de);
            double facteurVers = getFactorSurface(vers);
            double resultat = value * facteurDe / facteurVers;

            if (resultat < 0.01) labelSu.setText(String.format("%.6f %s", resultat, vers));
            else labelSu.setText(String.format("%.2f %s", resultat, vers));
            
            jouerSon();
            boxdeSu.requestFocus();
        } catch (Exception e) {
            labelSu.setText("Entrée invalide");
        }
    }

    @FXML
    public void convertirVolume() {
        if (ChampMontantVol.getText().isEmpty()) {
        labelVol.setText("Entrez une valeur");
        return;
    }
        try {
            double value = lireMontant(ChampMontantVol);
            String de = boxdeVol.getValue();
            String vers = boxversVol.getValue();

            double facteurDe = getFactorVolume(de);
            double facteurVers = getFactorVolume(vers);
            double resultat = value * facteurDe / facteurVers;

            if (resultat < 0.01) labelVol.setText(String.format("%.6f %s", resultat, vers));
            else labelVol.setText(String.format("%.2f %s", resultat, vers));

            jouerSon();
            boxdeVol.requestFocus();
        } catch (Exception e) {
            labelVol.setText("Entrée invalide");
        }
    }

    @FXML
    private void convertirTemps() {
        if (ChampMontantT.getText().isEmpty()) {
        labelT.setText("Entrez une valeur");
        return;
    }
        try {
            double montant = lireMontant(ChampMontantT); 
            String de = boxdeT.getValue();
            String vers = boxversT.getValue();
            double res = montant; // si unités identiques

            // equalsIgnoreCase pour ignorer les majuscules/minuscules
            if (de.equalsIgnoreCase("Heure") && vers.equalsIgnoreCase("Minute")) res = montant * 60;
            else if (de.equalsIgnoreCase("Heure") && vers.equalsIgnoreCase("Seconde")) res = montant * 3600;
            else if (de.equalsIgnoreCase("Minute") && vers.equalsIgnoreCase("Heure")) res = montant / 60;
            else if (de.equalsIgnoreCase("Minute") && vers.equalsIgnoreCase("Seconde")) res = montant * 60;
            else if (de.equalsIgnoreCase("Seconde") && vers.equalsIgnoreCase("Heure")) res = montant / 3600;
            else if (de.equalsIgnoreCase("Seconde") && vers.equalsIgnoreCase("Minute")) res = montant / 60;

            jouerSon();
            boxdeT.requestFocus();

            labelT.setText(String.format("%.2f %s", res, vers));
        } catch (Exception e) {
            labelT.setText("Erreur");
        }
    }

    @FXML
    private void convertirVitesse() {
        if (ChampMontantV.getText().isEmpty()) {
        labelV.setText("Entrez une valeur");
        return;
    }
        try {
            double montant = lireMontant(ChampMontantV);
            String de = boxdeV.getValue();
            String vers = boxversV.getValue();
            double res = montant;

            if (de.equals("m/s") && vers.equals("km/h")) res = montant * 3.6;
            else if (de.equals("m/s") && vers.equals("mph")) res = montant * 2.23694;

            else if (de.equals("km/h") && vers.equals("m/s")) res = montant / 3.6;
            else if (de.equals("km/h") && vers.equals("mph")) res = montant / 1.60934;

            else if (de.equals("mph") && vers.equals("m/s")) res = montant / 2.23694;
            else if (de.equals("mph") && vers.equals("km/h")) res = montant * 1.60934;

            jouerSon();
            boxdeV.requestFocus();

            labelV.setText(String.format("%.2f %s", res, vers));
        } catch (Exception e) {
            labelV.setText("Erreur");
        }
    }

    @FXML
    private void convertirPoids() {
        if (ChampMontantP.getText().isEmpty()) {
        labelP.setText("Entrez une valeur");
        return;
    }
        try {
            double montant = lireMontant(ChampMontantP);
            String de = boxdeP.getValue();
            String vers = boxversP.getValue();

            double facteurDe = getFactorPoids(de);
            double facteurVers = getFactorPoids(vers);
            double resultat = montant * facteurDe / facteurVers;

            if (resultat < 0.01 && resultat > 0) labelP.setText(String.format("%.6f %s", resultat, vers));
            else labelP.setText(String.format("%.2f %s", resultat, vers));

            jouerSon();
            boxdeP.requestFocus();
        } catch (Exception e) {
            labelP.setText("Erreur");
        }
    }

    @FXML
    private void convertirStockage() {
        if (ChampMontantS.getText().isEmpty()) {
        labelS.setText("Entrez une valeur");
        return;
    }
        try {
            double montant = lireMontant(ChampMontantS);
            String de = boxdeS.getValue();
            String vers = boxversS.getValue();

            double facteurDe = getFactorStockage(de);
            double facteurVers = getFactorStockage(vers);
            double resultat = montant * facteurDe / facteurVers;

            if (resultat < 0.001 && resultat > 0) labelS.setText(String.format("%.8f %s", resultat, vers));
            else labelS.setText(String.format("%.4f %s", resultat, vers));

            jouerSon();
            boxdeS.requestFocus();
        } catch (Exception e) {
            labelS.setText("Erreur");
        }
    }

    @FXML
    private void convertirBinaire() {
        if (ChampMontantBH.getText().isEmpty()) {
        labelBH.setText("Entrez une valeur");
        return;
    }
        try {
            String texte = ChampMontantBH.getText().trim();
            if (texte.isEmpty()) return;

            String de = boxdeBH.getValue();
            String vers = boxversBH.getValue();

            // 1. Conversion en décimal
            long valeurDecimale = 0; //long pour grands nombres (plus que int)

            if (de.equals("Décimal")) {
                valeurDecimale = Long.parseLong(texte); // Base 10
            } else if (de.equals("Binaire")) {
                valeurDecimale = Long.parseLong(texte, 2); // Base 2
            } else if (de.equals("Hexadécimal")) {
                valeurDecimale = Long.parseLong(texte, 16); // Base 16
            }

            // 2. Conversion vers l'unité cible
            String resultat = "";
            if (vers.equals("Décimal")) {
                resultat = Long.toString(valeurDecimale); //Ne change rien
            } else if (vers.equals("Binaire")) {
                resultat = Long.toBinaryString(valeurDecimale); //Convertit en binaire
            } else if (vers.equals("Hexadécimal")) {
                resultat = Long.toHexString(valeurDecimale).toUpperCase(); //Convertit en hexadécimal
            }

            labelBH.setText(resultat);
            jouerSon();
            boxdeBH.requestFocus();

        } catch (NumberFormatException e) {
            labelBH.setText("Format Invalide");
        } catch (Exception e) {
            labelBH.setText("Erreur");
        }
    }
}

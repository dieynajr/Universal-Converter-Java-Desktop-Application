public class dieyna {

    // =======================================================
    // 1. ONGLET DISTANCE 
    // =======================================================
    @FXML private TextField ChampMontantD;
    @FXML private Label labelD;
    @FXML private ComboBox<String> boxdeD;
    @FXML private ComboBox<String> boxversD;

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
         @FXML
        private void inverserDistance() {
        String temp = boxdeD.getValue();
        boxdeD.setValue(boxversD.getValue());
        boxversD.setValue(temp);
        convertirDistance();
    }
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

// =======================================================
    // 3. ONGLET TEMPÉRATURE 
    // =======================================================
    @FXML private TextField ChampMontantTemp;
    @FXML private Label labelTemp;
    @FXML private ComboBox<String> boxdeTemp;
    @FXML private ComboBox<String> boxversTemp;
    
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

         @FXML
        private void inverserTempérature() {
            String temp = boxdeTemp.getValue();
            boxdeTemp.setValue(boxversTemp.getValue());
            boxversTemp.setValue(temp);
            convertirTempérature();
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


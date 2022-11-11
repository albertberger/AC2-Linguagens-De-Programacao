package view;

import connections.MySQL;
import javax.swing.JOptionPane;
import objects.Employee;

public class EmplyoeeRegistrationScreen extends javax.swing.JFrame {
    
    //Instanciar classes.
    MySQL conectar = new MySQL();
    Employee newEmployee = new Employee();
    

    public EmplyoeeRegistrationScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeEmployee = new javax.swing.JTextField();
        txtCpfEmployee = new javax.swing.JTextField();
        txtNascimentoEmployee = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCpfBuscaEmployee = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtCargoEmployee = new javax.swing.JTextField();
        txtAdmissaoEmployee = new javax.swing.JTextField();
        txtEnderecoEmployee = new javax.swing.JTextField();
        txtCidadeEmployee = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtSexoEmployee = new javax.swing.JTextField();
        txtEstadoEmployee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 182, 149));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta e Registro de Funcionários");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data de Nascimento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Endereço");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cidade");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cargo");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Data de Admissão");

        txtCpfEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfEmployeeActionPerformed(evt);
            }
        });

        txtNascimentoEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoEmployeeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Estado");

        txtCpfBuscaEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfBuscaEmployeeActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar Funcionário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("CPF:");

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpar Busca");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtCargoEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoEmployeeActionPerformed(evt);
            }
        });

        txtAdmissaoEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissaoEmployeeActionPerformed(evt);
            }
        });

        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Atualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Deletar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfBuscaEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtNomeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpfEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNascimentoEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSexoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtCargoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(193, 193, 193)
                                        .addComponent(jLabel7))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEnderecoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCidadeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAdmissaoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtEstadoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfBuscaEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel11)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimentoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissaoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Função buscar funcionário no banco de dados.
    
    private void searchEmployee(Employee newEmployee){
        
        newEmployee.LimparEmployee();
        this.txtNomeEmployee.setText("");
        this.txtCpfEmployee.setText("");
        this.txtNascimentoEmployee.setText("");
        this.txtCargoEmployee.setText("");
        this.txtAdmissaoEmployee.setText("");
        this.txtEnderecoEmployee.setText("");
        this.txtCidadeEmployee.setText("");
        this.txtSexoEmployee.setText("");
        this.txtEstadoEmployee.setText("");
        
        this.conectar.conectaBanco();
        
        String buscarCpf = this.txtCpfBuscaEmployee.getText();
        
        try{
            var searchEmployee = "SELECT "
                    +"nome,"
                    + "cpf,"
                    + "data_de_nascimento,"
                    + "sexo,"
                    + "cargo,"
                    + "data_de_admissao,"
                    + "endereco,"
                    + "cidade,"
                    + "estado"
                    + " FROM "
                    + "Employee"
                    + " WHERE "
                    + " cpf = '"+ buscarCpf + "';";
            this.conectar.executarSQL(searchEmployee);
        
            while(this.conectar.getResultSet().next()){
                newEmployee.setNomeEmployee(this.conectar.getResultSet().getString(1));
                newEmployee.setCpfEmployee(this.conectar.getResultSet().getString(2));
                newEmployee.setNascimentoEmployee(this.conectar.getResultSet().getString(3));
                newEmployee.setSexoEmployee(this.conectar.getResultSet().getString(4));
                newEmployee.setCargoEmployee(this.conectar.getResultSet().getString(5));
                newEmployee.setAdmissaoEmployee(this.conectar.getResultSet().getString(6));
                newEmployee.setEnderecoEmployee(this.conectar.getResultSet().getString(7));
                newEmployee.setCidadeEmployee(this.conectar.getResultSet().getString(8));
                newEmployee.setEstadoEmployee(this.conectar.getResultSet().getString(9));
            
            }
            if(newEmployee.getCpfEmployee() == ""){
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }
        }
        catch(Exception e){
            System.out.println("Erro ao cosultar funcionário! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cosultar funcionário!");
        }
        finally{
            txtNomeEmployee.setText(newEmployee.getNomeEmployee());
            txtCpfEmployee.setText(newEmployee.getCpfEmployee());
            txtNascimentoEmployee.setText(newEmployee.getNascimentoEmployee());
            txtSexoEmployee.setText(newEmployee.getSexoEmployee());
            txtCargoEmployee.setText(newEmployee.getCargoEmployee());
            txtAdmissaoEmployee.setText(newEmployee.getAdmissaoEmployee());
            txtEnderecoEmployee.setText(newEmployee.getEnderecoEmployee());
            txtCidadeEmployee.setText(newEmployee.getCidadeEmployee());
            txtEstadoEmployee.setText(newEmployee.getEstadoEmployee());
            
            
    
            this.conectar.fechaBanco();
        }
    }
    
    //Função cadastrar funcionário no banco de dados.
    
    private void registerEmployee(Employee newEmployeea){
        this.conectar.conectaBanco();
        
        newEmployeea.setNomeEmployee(txtNomeEmployee.getText());
        newEmployeea.setCpfEmployee(txtCpfEmployee.getText());
        newEmployeea.setNascimentoEmployee(txtNascimentoEmployee.getText());
        newEmployeea.setSexoEmployee(txtSexoEmployee.getText());
        //newEmployeea.setSexoEmployee(String.valueOf(txtSexoEmployee.getSelectedItem()));
        newEmployeea.setCargoEmployee(txtCargoEmployee.getText());
        newEmployeea.setAdmissaoEmployee(txtAdmissaoEmployee.getText());
        newEmployeea.setEnderecoEmployee(txtEnderecoEmployee.getText());
        newEmployeea.setCidadeEmployee(txtCidadeEmployee.getText());
        newEmployeea.setEstadoEmployee(txtEstadoEmployee.getText());
        //newEmployeea.setEstadoEmployee(String.valueOf(txtEstadoEmployee.getSelectedItem()));
        
        try{
            var registerEmployee = "INSERT INTO `Employee` ("
                    +"nome,"
                    + "cpf,"
                    + "data_de_nascimento,"
                    + "sexo,"
                    + "cargo,"
                    + "data_de_admissao,"
                    + "endereco,"
                    + "cidade,"
                    + "estado)  values("
                    +"'" + newEmployeea.getNomeEmployee() +"',"
                    + "'" + newEmployeea.getCpfEmployee() +"',"
                    + "'" + newEmployeea.getNascimentoEmployee() +"',"
                    + "'" + newEmployeea.getSexoEmployee() +"',"
                    + "'" + newEmployeea.getCargoEmployee() +"',"
                    + "'" + newEmployeea.getAdmissaoEmployee() +"',"
                    + "'" + newEmployeea.getEnderecoEmployee() +"',"
                    + "'" + newEmployeea.getCidadeEmployee() +"',"
                    + "'" + newEmployeea.getEstadoEmployee() +"'"
                    +");";
            
            this.conectar.insertSQL(registerEmployee);
            
        }
        catch(Exception e){
            
            System.out.println("Erro ao cadastrar o cliente! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o funcionário!");
        }
        finally{
            
        this.conectar.fechaBanco();
        JOptionPane.showMessageDialog(null, "Sucesso ao cadastrar o funcionário!");
        }
    }
    
    //Função atualizar funcionário no banco de dados.
    
    public void updateEmployee(Employee newEmployee){
        this.conectar.conectaBanco();
        
        String buscarCpf = this.txtCpfBuscaEmployee.getText();
        
        try{
            var updateEmployee = "UPDATE cadastroclientes SET "
                    +"nome,"
                    + "cpf,"
                    + "data_de_nascimento,"
                    + "sexo,"
                    + "cargo,"
                    + "data_de_admissao,"
                    + "endereco,"
                    + "cidade,"
                    + "estado)  values("
                    +"'" + newEmployee.getNomeEmployee() +"',"
                    + "'" + newEmployee.getCpfEmployee() +"',"
                    + "'" + newEmployee.getNascimentoEmployee() +"',"
                    + "'" + newEmployee.getSexoEmployee() +"',"
                    + "'" + newEmployee.getCargoEmployee() +"',"
                    + "'" + newEmployee.getAdmissaoEmployee() +"',"
                    + "'" + newEmployee.getEnderecoEmployee() +"',"
                    + "'" + newEmployee.getCidadeEmployee() +"',"
                    + "'" + newEmployee.getEstadoEmployee() +"'"
                    +");";
            this.conectar.updateSQL(buscarCpf);
            
            if(newEmployee.getNomeEmployee() == ""){
                JOptionPane.showMessageDialog(null, "CPF não encontrado!");
            }
            
            }
        catch (Exception e){
            System.out.println("Erro ao atualizar funcionário! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar funcionário!");
        }
        finally{
            txtNomeEmployee.setText(newEmployee.getNomeEmployee());
            txtCpfEmployee.setText(newEmployee.getCpfEmployee());
            txtNascimentoEmployee.setText(newEmployee.getNascimentoEmployee());
            txtSexoEmployee.setText(newEmployee.getSexoEmployee());
            txtCargoEmployee.setText(newEmployee.getCargoEmployee());
            txtAdmissaoEmployee.setText(newEmployee.getAdmissaoEmployee());
            txtEnderecoEmployee.setText(newEmployee.getEnderecoEmployee());
            txtCidadeEmployee.setText(newEmployee.getCidadeEmployee());
            txtEstadoEmployee.setText(newEmployee.getEstadoEmployee());
        }
                    
    }
    
    //Função deletar funcionário no banco de dados.
    
    public void deleteEmployee(Employee newEmployee){
        this.conectar.conectaBanco();
        
        String buscarCpf = this.txtCpfBuscaEmployee.getText();
        
        try{
            var deletarEmployee = "DELETE FROM Employee WHERE cpf = '" + buscarCpf + "'";
            this.conectar.updateSQL(deletarEmployee);
        }
        catch (Exception e){
                System.out.println("Erro ao deletar cliente! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente!");
            }
        finally{
            newEmployee.LimparEmployee();
            this.txtNomeEmployee.setText("");
            this.txtCpfEmployee.setText("");
            this.txtNascimentoEmployee.setText("");
            this.txtCargoEmployee.setText("");
            this.txtAdmissaoEmployee.setText("");
            this.txtEnderecoEmployee.setText("");
            this.txtCidadeEmployee.setText("");
            this.txtSexoEmployee.setText("");
            this.txtEstadoEmployee.setText("");
        }
    }

    
    
    
    private void txtCpfEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfEmployeeActionPerformed

    private void txtNascimentoEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoEmployeeActionPerformed

    private void txtCpfBuscaEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfBuscaEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfBuscaEmployeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchEmployee(newEmployee);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginScreen user = new LoginScreen();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCargoEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoEmployeeActionPerformed

    private void txtAdmissaoEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissaoEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissaoEmployeeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        registerEmployee(newEmployee);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        deleteEmployee(newEmployee);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        updateEmployee(newEmployee);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        newEmployee.LimparEmployee();
        this.txtCpfBuscaEmployee.setText("");
        this.txtNomeEmployee.setText("");
        this.txtCpfEmployee.setText("");
        this.txtNascimentoEmployee.setText("");
        this.txtCargoEmployee.setText("");
        this.txtAdmissaoEmployee.setText("");
        this.txtEnderecoEmployee.setText("");
        this.txtCidadeEmployee.setText("");
        this.txtSexoEmployee.setText("");
        this.txtEstadoEmployee.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmplyoeeRegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmplyoeeRegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmplyoeeRegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmplyoeeRegistrationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmplyoeeRegistrationScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAdmissaoEmployee;
    private javax.swing.JTextField txtCargoEmployee;
    private javax.swing.JTextField txtCidadeEmployee;
    private javax.swing.JTextField txtCpfBuscaEmployee;
    private javax.swing.JTextField txtCpfEmployee;
    private javax.swing.JTextField txtEnderecoEmployee;
    private javax.swing.JTextField txtEstadoEmployee;
    private javax.swing.JTextField txtNascimentoEmployee;
    private javax.swing.JTextField txtNomeEmployee;
    private javax.swing.JTextField txtSexoEmployee;
    // End of variables declaration//GEN-END:variables
}

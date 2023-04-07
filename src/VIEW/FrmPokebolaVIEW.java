package VIEW;

import DAO.PokebolaDAO;
import DTO.PokebolaDTO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPokebolaVIEW extends javax.swing.JFrame {

    /**
     * Cria um novo formulário frmPokebolaVIEW
     */
    public FrmPokebolaVIEW() { // Inicializador
        initComponents();
        listarValoresPokemon();
    }

    /**
     * Este método é chamado de dentro do construtor para inicializar o
     * formulário. ATENÇÃO: NÃO modifique este código. O conteúdo deste método é
     * sempre regenerado pelo Editor de formulários
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRaridade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPokemon = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnCarregarCampos = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pokémon");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 104, -1, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 126, 200, -1));

        jLabel2.setText("Raridade");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 164, -1, -1));

        txtRaridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaridadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtRaridade, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 186, 200, -1));

        btnCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 218, -1, -1));

        tblPokemon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "POKÉMON", "RARIDADE"
            }
        ));
        jScrollPane1.setViewportView(tblPokemon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 289, 306, 194));

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        btnPesquisar.setText("LISTAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 252, -1, -1));

        jLabel3.setText("Código");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 44, -1, -1));

        txtCodigo.setEnabled(false);
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 66, 110, -1));

        btnCarregarCampos.setBackground(new java.awt.Color(51, 0, 255));
        btnCarregarCampos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCarregarCampos.setForeground(new java.awt.Color(0, 0, 0));
        btnCarregarCampos.setText("CARREGAR CAMPOS");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 252, -1, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 267, -1, -1));

        btnAlterar.setBackground(new java.awt.Color(255, 255, 0));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 218, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 218, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/Charizard.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, 200));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/Pokebola.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRaridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaridadeActionPerformed
        // TODO adicione seu código de manipulação aqui:
    }//GEN-LAST:event_txtRaridadeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrarPokemon();
        listarValoresPokemon();
        limparCamposTabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        listarValoresPokemon();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        carregarCamposTabela();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCamposTabela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarPokemon();
        listarValoresPokemon();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirPokemon();
        listarValoresPokemon();
        limparCamposTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args os argumentos da linha de comando
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
            java.util.logging.Logger.getLogger(FrmPokebolaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPokebolaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPokebolaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPokebolaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Criar e exibir o formulário */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPokebolaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPokemon;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRaridade;
    // End of variables declaration//GEN-END:variables

    private void cadastrarPokemon() {
        String nome, raridade; // Declaração de variáveis!

        // Estou pegando na propriedade getText o que o usuário digitou no campo txtNome
        nome = txtNome.getText(); // Recebe esses valores!
        raridade = txtRaridade.getText();

        // Criando um objeto e transferindo informações para a DTO
        PokebolaDTO objpokeboladto = new PokebolaDTO(); // Passa para a DTO!
        objpokeboladto.setNome_pokemon(nome);
        objpokeboladto.setRaridade_pokemon(raridade);

        // Acessando minha class de conexão
        PokebolaDAO objpokeboladao = new PokebolaDAO(); // Executa a DAO!
        objpokeboladao.cadastrarPokemon(objpokeboladto);
    }

    private void listarValoresPokemon() {
        try { // acessando a class DAO através do objeto
            PokebolaDAO objpokeboladao = new PokebolaDAO();

            DefaultTableModel model = (DefaultTableModel) tblPokemon.getModel();
            model.setNumRows(0);

            ArrayList<PokebolaDTO> lista = objpokeboladao.pesquisarPokemon();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_pokemon(),
                    lista.get(num).getNome_pokemon(),
                    lista.get(num).getRaridade_pokemon()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW" + erro);
        }
    }

    private void carregarCamposTabela() { // Método para carregar os campos
        int setar = tblPokemon.getSelectedRow();

        txtCodigo.setText(tblPokemon.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tblPokemon.getModel().getValueAt(setar, 1).toString());
        txtRaridade.setText(tblPokemon.getModel().getValueAt(setar, 2).toString());
    }

    private void limparCamposTabela() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtRaridade.setText("");
        txtNome.requestFocus();
    }

    private void alterarPokemon() {
        int id_pokemon; 
        String nome_pokemon, raridade_pokemon; // Declaração de variáveis!
        
        // OBS: Fazendo conversão no id
        id_pokemon = Integer.parseInt(txtCodigo.getText()); // Recebe esses valores!
        nome_pokemon = txtNome.getText(); 
        raridade_pokemon = txtRaridade.getText();
        
        // OBS: Só acesso minha class através do meu objeto
        PokebolaDTO objpokeboladto = new PokebolaDTO(); // Passa para a DTO!
        objpokeboladto.setId_pokemon(id_pokemon); 
        objpokeboladto.setNome_pokemon(nome_pokemon);
        objpokeboladto.setRaridade_pokemon(raridade_pokemon);
        
        PokebolaDAO objpokeboladao = new PokebolaDAO(); // Executa a DAO!
        objpokeboladao.alterarPokemon(objpokeboladto); 
    }
    
    private void excluirPokemon() {
        int id_pokemon;
  
        id_pokemon = Integer.parseInt(txtCodigo.getText());
        
        PokebolaDTO objpokeboladto = new PokebolaDTO();
        objpokeboladto.setId_pokemon(id_pokemon);
        
        PokebolaDAO pokeboladao = new PokebolaDAO();
        pokeboladao.excluirPokemon(objpokeboladto);
    }
    
}

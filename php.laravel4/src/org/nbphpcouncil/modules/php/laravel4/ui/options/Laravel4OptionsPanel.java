/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted 2013 NetBeans PHP Community Council"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2013 Sun Microsystems, Inc.
 */
package org.nbphpcouncil.modules.php.laravel4.ui.options;

import java.awt.Cursor;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import org.openide.awt.HtmlBrowser;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.filesystems.FileUtil;
import org.openide.util.ChangeSupport;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

final class Laravel4OptionsPanel extends javax.swing.JPanel {

    private static final String SKELETON_LAST_FOLDER_SUFFIX = ".skeleton"; // NOI18N
    @NbBundle.Messages("Laravel4OptionsPanel.zip.filter=Zip File (*.zip)")
    private static final FileFilter ZIP_FILE_FILTER = new FileFilter() {
        @Override
        public boolean accept(File f) {
            if (f.isDirectory()) {
                return true;
            }
            
            return f.isFile() && f.getName().toLowerCase().endsWith(".zip"); // NOI18N
        }

        @Override
        public String getDescription() {
            return Bundle.Laravel4OptionsPanel_zip_filter();
        }
    };
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    public Laravel4OptionsPanel() {
        initComponents();

        errorLabel.setText(" "); // NOI18N

        initListeners();
    }

    public String getSkeleton() {
        return skeletonTextField.getText();
    }

    public void setSkeleton(String skeleton) {
        skeletonTextField.setText(skeleton);
    }

    public void setError(String message) {
        errorLabel.setText(" "); // NOI18N
        errorLabel.setForeground(UIManager.getColor("nb.errorForeground")); // NOI18N
        errorLabel.setText(message);
    }

    public void setWarning(String message) {
        errorLabel.setText(" "); // NOI18N
        errorLabel.setForeground(UIManager.getColor("nb.warningForeground")); // NOI18N
        errorLabel.setText(message);
    }
    
    public void addChangeListener(ChangeListener listener) {
        changeSupport.addChangeListener(listener);
    }

    public void removeChangeListener(ChangeListener listener) {
        changeSupport.removeChangeListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        skeletonLabel = new javax.swing.JLabel();
        skeletonTextField = new javax.swing.JTextField();
        browseSkeletonButton = new javax.swing.JButton();
        skeletonInfoLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        downloadSkeletonLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(skeletonLabel, org.openide.util.NbBundle.getMessage(Laravel4OptionsPanel.class, "Laravel4OptionsPanel.skeletonLabel.text")); // NOI18N

        skeletonTextField.setText(org.openide.util.NbBundle.getMessage(Laravel4OptionsPanel.class, "Laravel4OptionsPanel.skeletonTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browseSkeletonButton, org.openide.util.NbBundle.getMessage(Laravel4OptionsPanel.class, "Laravel4OptionsPanel.browseSkeletonButton.text")); // NOI18N
        browseSkeletonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseSkeletonButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(skeletonInfoLabel, org.openide.util.NbBundle.getMessage(Laravel4OptionsPanel.class, "Laravel4OptionsPanel.skeletonInfoLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(noteLabel, org.openide.util.NbBundle.getMessage(Laravel4OptionsPanel.class, "Laravel4OptionsPanel.noteLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(downloadSkeletonLabel, org.openide.util.NbBundle.getMessage(Laravel4OptionsPanel.class, "Laravel4OptionsPanel.downloadSkeletonLabel.text")); // NOI18N
        downloadSkeletonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                downloadSkeletonLabelMousePressed(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downloadSkeletonLabelMouseEntered(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(errorLabel, org.openide.util.NbBundle.getMessage(Laravel4OptionsPanel.class, "Laravel4OptionsPanel.errorLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(skeletonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(skeletonInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(skeletonTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseSkeletonButton))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(downloadSkeletonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noteLabel)
                    .addComponent(errorLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skeletonLabel)
                    .addComponent(skeletonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseSkeletonButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skeletonInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(noteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downloadSkeletonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void downloadSkeletonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadSkeletonLabelMouseEntered
        evt.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_downloadSkeletonLabelMouseEntered

    private void downloadSkeletonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadSkeletonLabelMousePressed
        // TODO add your handling code here:
        try {
            URL url = new URL("https://github.com/laravel/laravel"); // NOI18N
            HtmlBrowser.URLDisplayer.getDefault().showURL(url);
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_downloadSkeletonLabelMousePressed

    @NbBundle.Messages("Laravel4OptionsPanel.browse.skeleton=Select Laravel Skeleton Application (.zip)")
    private void browseSkeletonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseSkeletonButtonActionPerformed
        File skeleton = new FileChooserBuilder(Laravel4OptionsPanel.class.getName() + SKELETON_LAST_FOLDER_SUFFIX)
                .setTitle(Bundle.Laravel4OptionsPanel_browse_skeleton())
                .setFilesOnly(true)
                .setFileFilter(ZIP_FILE_FILTER)
                .showOpenDialog();
        
        if (skeleton != null) {
            skeleton = FileUtil.normalizeFile(skeleton);
            skeletonTextField.setText(skeleton.getAbsolutePath());
        }
    }//GEN-LAST:event_browseSkeletonButtonActionPerformed

    void fireChange() {
        changeSupport.fireChange();
    }

    private void initListeners() {
        skeletonTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                processUpdate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                processUpdate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                processUpdate();
            }

            private void processUpdate() {
                fireChange();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseSkeletonButton;
    private javax.swing.JLabel downloadSkeletonLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel skeletonInfoLabel;
    private javax.swing.JLabel skeletonLabel;
    private javax.swing.JTextField skeletonTextField;
    // End of variables declaration//GEN-END:variables
}

package org.campagnelab.antlr.persistence.impl;

/*Generated by MPS */

import org.jetbrains.mps.openapi.persistence.ModelFactory;
import jetbrains.mps.extapi.model.SModelPersistence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.persistence.DataSource;
import java.util.Map;
import java.io.IOException;
import org.jetbrains.mps.openapi.persistence.ModelSaveException;
import jetbrains.mps.extapi.model.SModelData;
import org.jetbrains.mps.openapi.model.SModelReference;
import org.jetbrains.mps.openapi.persistence.StreamDataSource;
import jetbrains.mps.smodel.SModelId;
import jetbrains.mps.util.FileUtil;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.adapter.ids.MetaIdByDeclaration;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

public class AntlrPersistenceImpl implements ModelFactory, SModelPersistence {

  @NotNull
  @Override
  public SModel load(@NotNull DataSource source, @NotNull Map<String, String> map) throws IOException {
    return null;
  }
  @NotNull
  @Override
  public SModel create(DataSource source, @NotNull Map<String, String> map) throws IOException {
    return null;
  }
  @Override
  public boolean canCreate(DataSource source, @NotNull Map<String, String> map) {
    return false;
  }
  @Override
  public boolean needsUpgrade(DataSource source) throws IOException {
    return false;
  }
  @Override
  public void upgrade(DataSource source) throws IOException {
  }
  @Override
  public void save(SModel model, DataSource source) throws ModelSaveException, IOException {
  }
  @Override
  public boolean isBinary() {
    return false;
  }
  @Override
  public String getFileExtension() {
    return ".g4";
  }
  @Override
  public String getFormatTitle() {
    return "ANTRL Lexer/Parser (.g4)";
  }
  @Override
  public SModelData createEmpty(SModelReference reference, StreamDataSource source) {
    jetbrains.mps.smodel.SModel sModel = new jetbrains.mps.smodel.SModel(reference);
    String name = reference.getModelName();
    if (reference.getModelId() instanceof SModelId.RelativePathSModelId) {
      name = FileUtil.getNameWithoutExtension(((SModelId.RelativePathSModelId) reference.getModelId()).getFileName());
    }
    SNode grammar = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113222a9L, "org.campagnelab.ANTLR.structure.Grammar")));
    sModel.addLanguage(MetaIdByDeclaration.ref2Id(PersistenceFacade.getInstance().createModuleReference("d6782141-eafa-4cf7-a85d-1229abdb1152(org.campagnelab.ANTLR)")), 0);
    sModel.addRootNode(grammar);
    return sModel;
  }
  @Override
  public SModelData readModel(SModelReference reference, StreamDataSource source) throws IOException {
    return null;
  }
  @Override
  public void writeModel(SModelData data, StreamDataSource source) throws IOException, ModelSaveException {
  }
}

package org.campagnelab.antlr.tomps.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionAspectBase;
import jetbrains.mps.intentions.IntentionFactory;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import java.util.Arrays;

public final class IntentionsDescriptor extends IntentionAspectBase {
  private final long[] myId2Index;
  private IntentionFactory[] myIntentions0;
  private IntentionFactory[] myIntentions1;
  private IntentionFactory[] myIntentions2;
  private IntentionFactory[] myIntentions3;
  private IntentionFactory[] myIntentions4;
  private IntentionFactory[] myIntentions5;
  private IntentionFactory[] myIntentions6;
  private IntentionFactory[] myIntentions7;
  private IntentionFactory[] myIntentions8;

  public IntentionsDescriptor() {
    myId2Index = new long[9];
    myId2Index[0] = 0x27b12e38d7577b90L;
    myId2Index[1] = 0x4aaf5f3861bb9099L;
    myId2Index[2] = 0x631eebe3113222a9L;
    myId2Index[3] = 0x631eebe31132d843L;
    myId2Index[4] = 0x631eebe3113e657fL;
    myId2Index[5] = 0x6912564f422833dbL;
    myId2Index[6] = 0x69d936b00a0eba02L;
    myId2Index[7] = 0x6a1bb02ea6061b82L;
    myId2Index[8] = 0x6a1bb02ea606232bL;
  }

  @Override
  @Nullable
  public Collection<IntentionFactory> getIntentions(@NotNull SConceptId conceptId) {
    final int index = Arrays.binarySearch(myId2Index, conceptId.getIdValue());
    switch (index) {
      case 0:
        // Concept: PropertyDestination 
        if (myIntentions0 == null) {
          myIntentions0 = new IntentionFactory[1];
          myIntentions0[0] = new PropertyAsType_Intention();
        }
        return Arrays.asList(myIntentions0);
      case 1:
        // Concept: ChildDestination 
        if (myIntentions1 == null) {
          myIntentions1 = new IntentionFactory[1];
          myIntentions1[0] = new ChildAsOperator_Intention();
        }
        return Arrays.asList(myIntentions1);
      case 2:
        // Concept: Grammar 
        if (myIntentions2 == null) {
          myIntentions2 = new IntentionFactory[1];
          myIntentions2[0] = new RenameLabelsFromConceptsIn_Intention();
        }
        return Arrays.asList(myIntentions2);
      case 3:
        // Concept: ParserRuleBlock 
        if (myIntentions3 == null) {
          myIntentions3 = new IntentionFactory[1];
          myIntentions3[0] = new DeclareOperator_Intention();
        }
        return Arrays.asList(myIntentions3);
      case 4:
        // Concept: StringLiteral 
        if (myIntentions4 == null) {
          myIntentions4 = new IntentionFactory[1];
          myIntentions4[0] = new AddLabelSubconcept_Intention();
        }
        return Arrays.asList(myIntentions4);
      case 5:
        // Concept: LexerRuleSource 
        if (myIntentions5 == null) {
          myIntentions5 = new IntentionFactory[2];
          myIntentions5[0] = new AddTrimCharacters_Intention();
          myIntentions5[1] = new ForceGetText_Intention();
        }
        return Arrays.asList(myIntentions5);
      case 6:
        // Concept: ConceptMapper 
        if (myIntentions6 == null) {
          myIntentions6 = new IntentionFactory[5];
          myIntentions6[0] = new CreateConcept_Intention();
          myIntentions6[1] = new AddAllAlternatives_Intention();
          myIntentions6[2] = new CreateConceptAndLabels_Intention();
          myIntentions6[3] = new CreateEditors_Intention();
          myIntentions6[4] = new CreateTextGens_Intention();
        }
        return Arrays.asList(myIntentions6);
      case 7:
        // Concept: ConvertToMPS 
        if (myIntentions7 == null) {
          myIntentions7 = new IntentionFactory[5];
          myIntentions7[0] = new ResolveAllAlternativesById_Intention();
          myIntentions7[1] = new SortOperatorsByPriority_Intention();
          myIntentions7[2] = new CreateOperatorConcepts_Intention();
          myIntentions7[3] = new SwitchToOperatorNames_Intention();
          myIntentions7[4] = new CreateOperatorTextGen_Intention();
        }
        return Arrays.asList(myIntentions7);
      case 8:
        // Concept: AlternativeMapper 
        if (myIntentions8 == null) {
          myIntentions8 = new IntentionFactory[3];
          myIntentions8[0] = new CreateConceptAndLabelsForAlt_Intention();
          myIntentions8[1] = new CreateEditor_Intention();
          myIntentions8[2] = new CreateTextGen_Intention();
        }
        return Arrays.asList(myIntentions8);
      default:
        return null;
    }
  }

  @NotNull
  @Override
  public Collection<IntentionFactory> getAllIntentions() {
    IntentionFactory[] rv = new IntentionFactory[20];
    rv[0] = new CreateConcept_Intention();
    rv[1] = new AddAllAlternatives_Intention();
    rv[2] = new ResolveAllAlternativesById_Intention();
    rv[3] = new AddLabelSubconcept_Intention();
    rv[4] = new CreateConceptAndLabels_Intention();
    rv[5] = new CreateConceptAndLabelsForAlt_Intention();
    rv[6] = new RenameLabelsFromConceptsIn_Intention();
    rv[7] = new PropertyAsType_Intention();
    rv[8] = new CreateEditors_Intention();
    rv[9] = new CreateEditor_Intention();
    rv[10] = new DeclareOperator_Intention();
    rv[11] = new SortOperatorsByPriority_Intention();
    rv[12] = new CreateOperatorConcepts_Intention();
    rv[13] = new SwitchToOperatorNames_Intention();
    rv[14] = new ChildAsOperator_Intention();
    rv[15] = new CreateTextGen_Intention();
    rv[16] = new CreateTextGens_Intention();
    rv[17] = new CreateOperatorTextGen_Intention();
    rv[18] = new AddTrimCharacters_Intention();
    rv[19] = new ForceGetText_Intention();
    return Arrays.asList(rv);
  }
}

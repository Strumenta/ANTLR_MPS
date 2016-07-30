package org.campagnelab.ANTLR.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBehaviorAspectDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.BHDescriptor;
import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import java.util.Arrays;

public final class BehaviorAspectDescriptor extends BaseBehaviorAspectDescriptor {
  private final BHDescriptor myTokenRef__BehaviorDescriptor = new TokenRef__BehaviorDescriptor();
  private final BHDescriptor myLabeledElement__BehaviorDescriptor = new LabeledElement__BehaviorDescriptor();
  private final BHDescriptor myNotSet__BehaviorDescriptor = new NotSet__BehaviorDescriptor();
  private final BHDescriptor myRange__BehaviorDescriptor = new Range__BehaviorDescriptor();
  private final BHDescriptor myLexerBlock__BehaviorDescriptor = new LexerBlock__BehaviorDescriptor();
  private final BHDescriptor myDot__BehaviorDescriptor = new Dot__BehaviorDescriptor();
  private final BHDescriptor myRule__BehaviorDescriptor = new Rule__BehaviorDescriptor();
  private final BHDescriptor myLexerRule__BehaviorDescriptor = new LexerRule__BehaviorDescriptor();
  private final BHDescriptor myLexerRuleBlock__BehaviorDescriptor = new LexerRuleBlock__BehaviorDescriptor();
  private final BHDescriptor myLexerAlt__BehaviorDescriptor = new LexerAlt__BehaviorDescriptor();
  private final BHDescriptor myLexerRuleRef__BehaviorDescriptor = new LexerRuleRef__BehaviorDescriptor();
  private final BHDescriptor myBlockSet__BehaviorDescriptor = new BlockSet__BehaviorDescriptor();
  private final BHDescriptor myParentheses__BehaviorDescriptor = new Parentheses__BehaviorDescriptor();
  private final BHDescriptor myRuleRefByName__BehaviorDescriptor = new RuleRefByName__BehaviorDescriptor();
  private final BHDescriptor myLexerRuleRefByName__BehaviorDescriptor = new LexerRuleRefByName__BehaviorDescriptor();
  private final BHDescriptor myLexerAltList__BehaviorDescriptor = new LexerAltList__BehaviorDescriptor();
  private final BHDescriptor myToTextOutput__BehaviorDescriptor = new ToTextOutput__BehaviorDescriptor();
  private final BHDescriptor myGrammar__BehaviorDescriptor = new Grammar__BehaviorDescriptor();
  private final BHDescriptor myParserRule__BehaviorDescriptor = new ParserRule__BehaviorDescriptor();
  private final BHDescriptor myAlternatives__BehaviorDescriptor = new Alternatives__BehaviorDescriptor();
  private final BHDescriptor myParserRuleBlock__BehaviorDescriptor = new ParserRuleBlock__BehaviorDescriptor();
  private final BHDescriptor mySequence__BehaviorDescriptor = new Sequence__BehaviorDescriptor();
  private final BHDescriptor myParserRuleRef__BehaviorDescriptor = new ParserRuleRef__BehaviorDescriptor();
  private final BHDescriptor myAlternative__BehaviorDescriptor = new Alternative__BehaviorDescriptor();
  private final BHDescriptor myLexerToken__BehaviorDescriptor = new LexerToken__BehaviorDescriptor();
  private final BHDescriptor myStringLiteral__BehaviorDescriptor = new StringLiteral__BehaviorDescriptor();
  private final BHDescriptor myREGEXP__BehaviorDescriptor = new REGEXP__BehaviorDescriptor();
  private final BHDescriptor myHasOptionalParams__BehaviorDescriptor = new HasOptionalParams__BehaviorDescriptor();

  private final long[] myConceptBehaviorIds;

  public BehaviorAspectDescriptor() {
    myConceptBehaviorIds = new long[28];
    myConceptBehaviorIds[0] = 0x7c18b9e172f3f03L;
    myConceptBehaviorIds[1] = 0x7c18b9e17b73a85L;
    myConceptBehaviorIds[2] = 0xdb5f4ba9332cba7L;
    myConceptBehaviorIds[3] = 0xdb5f4ba93652fedL;
    myConceptBehaviorIds[4] = 0x155bede063d71d12L;
    myConceptBehaviorIds[5] = 0x175f2668a88033f2L;
    myConceptBehaviorIds[6] = 0x175f2668a88648aaL;
    myConceptBehaviorIds[7] = 0x175f2668a88648b1L;
    myConceptBehaviorIds[8] = 0x175f2668a886ac85L;
    myConceptBehaviorIds[9] = 0x175f2668a8872629L;
    myConceptBehaviorIds[10] = 0x175f2668a890ef9eL;
    myConceptBehaviorIds[11] = 0x1eb5241d3a14471dL;
    myConceptBehaviorIds[12] = 0x1ebae6380de529f8L;
    myConceptBehaviorIds[13] = 0x1ebae6380de70d78L;
    myConceptBehaviorIds[14] = 0x4e506a1ba17206d3L;
    myConceptBehaviorIds[15] = 0x4e506a1ba17cd353L;
    myConceptBehaviorIds[16] = 0x4eac1aea42e9c6e8L;
    myConceptBehaviorIds[17] = 0x631eebe3113222a9L;
    myConceptBehaviorIds[18] = 0x631eebe31132d838L;
    myConceptBehaviorIds[19] = 0x631eebe31132d842L;
    myConceptBehaviorIds[20] = 0x631eebe31132d843L;
    myConceptBehaviorIds[21] = 0x631eebe31132d846L;
    myConceptBehaviorIds[22] = 0x631eebe31132d966L;
    myConceptBehaviorIds[23] = 0x631eebe3113b458fL;
    myConceptBehaviorIds[24] = 0x631eebe3113e6560L;
    myConceptBehaviorIds[25] = 0x631eebe3113e657fL;
    myConceptBehaviorIds[26] = 0x631eebe3113ea53bL;
    myConceptBehaviorIds[27] = 0x797c10c6e517ac38L;
  }

  @Deprecated
  @Override
  public BehaviorDescriptor getDescriptor(String fqName) {
    return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
  }

  @Nullable
  @Override
  public BHDescriptor getDescriptor(@NotNull SConceptId conceptId) {
    int behaviorIndex = Arrays.binarySearch(myConceptBehaviorIds, conceptId.getIdValue());
    switch (behaviorIndex) {
      case 0:
        return myTokenRef__BehaviorDescriptor;
      case 1:
        return myLabeledElement__BehaviorDescriptor;
      case 2:
        return myNotSet__BehaviorDescriptor;
      case 3:
        return myRange__BehaviorDescriptor;
      case 4:
        return myLexerBlock__BehaviorDescriptor;
      case 5:
        return myDot__BehaviorDescriptor;
      case 6:
        return myRule__BehaviorDescriptor;
      case 7:
        return myLexerRule__BehaviorDescriptor;
      case 8:
        return myLexerRuleBlock__BehaviorDescriptor;
      case 9:
        return myLexerAlt__BehaviorDescriptor;
      case 10:
        return myLexerRuleRef__BehaviorDescriptor;
      case 11:
        return myBlockSet__BehaviorDescriptor;
      case 12:
        return myParentheses__BehaviorDescriptor;
      case 13:
        return myRuleRefByName__BehaviorDescriptor;
      case 14:
        return myLexerRuleRefByName__BehaviorDescriptor;
      case 15:
        return myLexerAltList__BehaviorDescriptor;
      case 16:
        return myToTextOutput__BehaviorDescriptor;
      case 17:
        return myGrammar__BehaviorDescriptor;
      case 18:
        return myParserRule__BehaviorDescriptor;
      case 19:
        return myAlternatives__BehaviorDescriptor;
      case 20:
        return myParserRuleBlock__BehaviorDescriptor;
      case 21:
        return mySequence__BehaviorDescriptor;
      case 22:
        return myParserRuleRef__BehaviorDescriptor;
      case 23:
        return myAlternative__BehaviorDescriptor;
      case 24:
        return myLexerToken__BehaviorDescriptor;
      case 25:
        return myStringLiteral__BehaviorDescriptor;
      case 26:
        return myREGEXP__BehaviorDescriptor;
      case 27:
        return myHasOptionalParams__BehaviorDescriptor;
      default:
        return null;
    }
  }
}

package org.campagnelab.ANTLR.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class Grammar_Behavior {
  public static void init(SNode thisNode) {
  }
  public static String virtual_toText_5668935624399900127(final SNode thisNode) {
    return "grammar " + ToTextOutput_Behavior.call_safeName_1175268421617889806(thisNode, SPropertyOperations.getString(thisNode, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))) + "{\n" + IterableUtils.join(ListSequence.fromList(SLinkOperations.getChildren(thisNode, MetaAdapterFactory.getContainmentLink(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe3113222a9L, 0x631eebe31132d83bL, "rules"))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return ToTextOutput_Behavior.call_safeToText_7095100507906137981(thisNode, it);
      }
    }), "\n") + "\n}";
  }
}

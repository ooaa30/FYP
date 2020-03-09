/**
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.generator;

import com.google.common.collect.Iterables;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule;
import fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WesnothDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource res, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Rule> _filter = Iterables.<Rule>filter(IteratorExtensions.<EObject>toIterable(res.getAllContents()), Rule.class);
    for (final Rule r : _filter) {
      fsa.generateFile("userRules.cfb", this.compile(r));
    }
  }
  
  public CharSequence compile(final Rule rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[combat]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[goto]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[recruit_rushers]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[castle_switch]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[retreat_injured]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[grab_villages]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[spread_poison]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[recruitment]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[move_leader_to_goals]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[move_leader_to_keep]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[high_xp_attack]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[place_healers]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[healing]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[villages]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[retreat]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[village_hunt]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[move_to_tagets]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[leader_shares_keep]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("side=1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("action=delete");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("path=stage[main_loop].candidate_action[move_to_any_enemy]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Fragment> _fragments = rule.getFragments();
      for(final Fragment frag : _fragments) {
        CharSequence _compile = this.compile(frag);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Fragment frag) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Defualt_CA> _defualt_cas = frag.getDefualt_cas();
      for(final Defualt_CA cas : _defualt_cas) {
        _builder.append("[modify_ai]");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("side =1");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("action = add");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("path = stage[main_loop].candidate_action[]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("[candidate_action]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("[filter_own]");
        _builder.newLine();
        _builder.append("\t\t");
        CharSequence _compile = this.compile(cas);
        _builder.append(_compile, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        CharSequence _compile_1 = this.compile(frag.getCondition());
        _builder.append(_compile_1, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("[/filter_own]");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("[/candidate_action");
        _builder.newLine();
        _builder.append("[/modify_ai]");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Defualt_CA ca) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final Conditional con) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(con.getCondition());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final AtLocation x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("x,y=");
    int _x = x.getX();
    _builder.append(_x);
    _builder.append(",");
    int _y = x.getY();
    _builder.append(_y);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Damage x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[filter_wml]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("hitpoints=($this_unit.max_hitpoints-");
    int _health = x.getHealth();
    _builder.append(_health, "\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("[/filter_wml]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final UnitEquals x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("type = ");
    String _unit = x.getUnit();
    _builder.append(_unit);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}

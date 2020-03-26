/**
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.wesnoth.wail.AtLocation;
import org.xtext.wesnoth.wail.Baseline;
import org.xtext.wesnoth.wail.Conditional;
import org.xtext.wesnoth.wail.Damage;
import org.xtext.wesnoth.wail.Defualt_CA;
import org.xtext.wesnoth.wail.Fragment;
import org.xtext.wesnoth.wail.GoaLocation;
import org.xtext.wesnoth.wail.Goal;
import org.xtext.wesnoth.wail.Rule;
import org.xtext.wesnoth.wail.UnitEquals;
import org.xtext.wesnoth.wail.whenRules;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WailGenerator extends AbstractGenerator {
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
    _builder.newLine();
    {
      EList<Goal> _goals = rule.getGoals();
      for(final Goal goal : _goals) {
        CharSequence _compile_1 = this.compile(goal);
        _builder.append(_compile_1);
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
        CharSequence _compile = this.compile(cas);
        _builder.append(_compile, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        CharSequence _compile_1 = this.compile(frag.getCondition());
        _builder.append(_compile_1, "\t\t\t");
        _builder.newLineIfNotEmpty();
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
    {
      String _caType = ca.getCaType();
      boolean _equals = Objects.equal(_caType, "movement");
      if (_equals) {
        _builder.append("id=goto");
        _builder.newLine();
        _builder.append("engine=cpp");
        _builder.newLine();
        _builder.append("name=ai_default_rca::goto_phase");
        _builder.newLine();
        {
          int _cost = ca.getCost();
          boolean _notEquals = (_cost != 0);
          if (_notEquals) {
            _builder.append("max_score=");
            int _cost_1 = ca.getCost();
            _builder.append(_cost_1);
            _builder.newLineIfNotEmpty();
            _builder.append("score=");
            int _cost_2 = ca.getCost();
            _builder.append(_cost_2);
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("max_score=200000");
            _builder.newLine();
            _builder.append("score=200000");
            _builder.newLine();
          }
        }
      } else {
        String _caType_1 = ca.getCaType();
        boolean _equals_1 = Objects.equal(_caType_1, "retreat");
        if (_equals_1) {
          _builder.append("id=retreat_injured");
          _builder.newLine();
          _builder.append("engine=lua");
          _builder.newLine();
          _builder.append("name=ai_default_rca::retreat_injured");
          _builder.newLine();
          {
            int _cost_3 = ca.getCost();
            boolean _notEquals_1 = (_cost_3 != 0);
            if (_notEquals_1) {
              _builder.append("max_score=");
              int _cost_4 = ca.getCost();
              _builder.append(_cost_4);
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("max_score=192000");
              _builder.newLine();
            }
          }
          _builder.append("location=\"ai/lua/ca_retreat_injured.lua\"");
          _builder.newLine();
        } else {
          String _caType_2 = ca.getCaType();
          boolean _equals_2 = Objects.equal(_caType_2, "move_to_target");
          if (_equals_2) {
            _builder.append("id=move_to_targets");
            _builder.newLine();
            _builder.append("engine=cpp");
            _builder.newLine();
            _builder.append("name=ai_default_rca::move_to_targets_phase");
            _builder.newLine();
            {
              int _cost_5 = ca.getCost();
              boolean _notEquals_2 = (_cost_5 != 0);
              if (_notEquals_2) {
                _builder.append("max_score=");
                int _cost_6 = ca.getCost();
                _builder.append(_cost_6);
                _builder.newLineIfNotEmpty();
                _builder.append("score=");
                int _cost_7 = ca.getCost();
                _builder.append(_cost_7);
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("max_score=20000");
                _builder.newLine();
                _builder.append("score=20000");
                _builder.newLine();
              }
            }
          } else {
            String _caType_3 = ca.getCaType();
            boolean _equals_3 = Objects.equal(_caType_3, "basic_movement");
            if (_equals_3) {
              _builder.append("id=move_to_any_enemy");
              _builder.newLine();
              _builder.append("engine=lua");
              _builder.newLine();
              _builder.append("name=ai_default_rca::move_to_any_enemy");
              _builder.newLine();
              {
                int _cost_8 = ca.getCost();
                boolean _notEquals_3 = (_cost_8 != 0);
                if (_notEquals_3) {
                  _builder.append("max_score=");
                  int _cost_9 = ca.getCost();
                  _builder.append(_cost_9);
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("max_score=1000");
                  _builder.newLine();
                }
              }
              _builder.append("location=\"ai/lua/ca_move_to_any_enemy.lua\"\t");
              _builder.newLine();
            } else {
              String _caType_4 = ca.getCaType();
              boolean _equals_4 = Objects.equal(_caType_4, "combat");
              if (_equals_4) {
                _builder.append("id=combat");
                _builder.newLine();
                _builder.append("engine=cpp");
                _builder.newLine();
                _builder.append("name=ai_default_rca::combat_phase");
                _builder.newLine();
                {
                  int _cost_10 = ca.getCost();
                  boolean _notEquals_4 = (_cost_10 != 0);
                  if (_notEquals_4) {
                    _builder.append("max_score=");
                    int _cost_11 = ca.getCost();
                    _builder.append(_cost_11);
                    _builder.newLineIfNotEmpty();
                    _builder.append("score=");
                    int _cost_12 = ca.getCost();
                    _builder.append(_cost_12);
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("max_score=100000");
                    _builder.newLine();
                    _builder.append("score=100000");
                    _builder.newLine();
                  }
                }
              } else {
                String _caType_5 = ca.getCaType();
                boolean _equals_5 = Objects.equal(_caType_5, "recruit");
                if (_equals_5) {
                  _builder.append("id=recruitment");
                  _builder.newLine();
                  _builder.append("engine=cpp");
                  _builder.newLine();
                  _builder.append("name=default_recruitment::recruitment");
                  _builder.newLine();
                  {
                    int _cost_13 = ca.getCost();
                    boolean _notEquals_5 = (_cost_13 != 0);
                    if (_notEquals_5) {
                      _builder.append("max_score=");
                      int _cost_14 = ca.getCost();
                      _builder.append(_cost_14);
                      _builder.newLineIfNotEmpty();
                      _builder.append("score=");
                      int _cost_15 = ca.getCost();
                      _builder.append(_cost_15);
                      _builder.newLineIfNotEmpty();
                    } else {
                      _builder.append("max_score=180000");
                      _builder.newLine();
                      _builder.append("score=180000");
                      _builder.newLine();
                    }
                  }
                } else {
                  String _caType_6 = ca.getCaType();
                  boolean _equals_6 = Objects.equal(_caType_6, "combat_value_targets");
                  if (_equals_6) {
                    _builder.append("id=high_xp_attack");
                    _builder.newLine();
                    _builder.append("engine=lua");
                    _builder.newLine();
                    _builder.append("name=ai_default_rca::high_xp_attack");
                    _builder.newLine();
                    _builder.append("location=\"ai/lua/ca_high_xp_attack.lua\"");
                    _builder.newLine();
                    {
                      int _cost_16 = ca.getCost();
                      boolean _notEquals_6 = (_cost_16 != 0);
                      if (_notEquals_6) {
                        _builder.append("max_score=");
                        int _cost_17 = ca.getCost();
                        _builder.append(_cost_17);
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("max_score=100010");
                        _builder.newLine();
                      }
                    }
                  } else {
                    String _caType_7 = ca.getCaType();
                    boolean _equals_7 = Objects.equal(_caType_7, "capture_villages");
                    if (_equals_7) {
                      _builder.append("id=villages");
                      _builder.newLine();
                      _builder.append("engine=cpp");
                      _builder.newLine();
                      _builder.append("name=ai_default_rca::get_villages_phase");
                      _builder.newLine();
                      {
                        int _cost_18 = ca.getCost();
                        boolean _notEquals_7 = (_cost_18 != 0);
                        if (_notEquals_7) {
                          _builder.append("max_score=");
                          int _cost_19 = ca.getCost();
                          _builder.append(_cost_19);
                          _builder.newLineIfNotEmpty();
                          _builder.append("score=");
                          int _cost_20 = ca.getCost();
                          _builder.append(_cost_20);
                          _builder.newLineIfNotEmpty();
                        } else {
                          _builder.append("max_score=60000");
                          _builder.newLine();
                          _builder.append("score=60000");
                          _builder.newLine();
                        }
                      }
                    } else {
                      String _caType_8 = ca.getCaType();
                      boolean _equals_8 = Objects.equal(_caType_8, "leader_to_keep");
                      if (_equals_8) {
                        _builder.append("id=move_leader_to_keep");
                        _builder.newLine();
                        _builder.append("engine=cpp");
                        _builder.newLine();
                        _builder.append("name=ai_default_rca::move_leader_to_keep_phase");
                        _builder.newLine();
                        {
                          int _cost_21 = ca.getCost();
                          boolean _notEquals_8 = (_cost_21 != 0);
                          if (_notEquals_8) {
                            _builder.append("max_score=");
                            int _cost_22 = ca.getCost();
                            _builder.append(_cost_22);
                            _builder.newLineIfNotEmpty();
                            _builder.append("score=");
                            int _cost_23 = ca.getCost();
                            _builder.append(_cost_23);
                            _builder.newLineIfNotEmpty();
                          } else {
                            _builder.append("max_score=120000");
                            _builder.newLine();
                            _builder.append("score=120000");
                            _builder.newLine();
                          }
                        }
                      } else {
                        String _caType_9 = ca.getCaType();
                        boolean _equals_9 = Objects.equal(_caType_9, "heal");
                        if (_equals_9) {
                          _builder.append("id=healing");
                          _builder.newLine();
                          _builder.append("engine=cpp");
                          _builder.newLine();
                          _builder.append("name=ai_default_rca::get_healing_phase");
                          _builder.newLine();
                          {
                            int _cost_24 = ca.getCost();
                            boolean _notEquals_9 = (_cost_24 != 0);
                            if (_notEquals_9) {
                              _builder.append("max_score=");
                              int _cost_25 = ca.getCost();
                              _builder.append(_cost_25);
                              _builder.newLineIfNotEmpty();
                              _builder.append("score=");
                              int _cost_26 = ca.getCost();
                              _builder.append(_cost_26);
                              _builder.newLineIfNotEmpty();
                            } else {
                              _builder.append("max_score=80000");
                              _builder.newLine();
                              _builder.append("score=80000");
                              _builder.newLine();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Conditional con) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _resolve = this.resolve(con.getX());
    _builder.append(_resolve);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _resolve(final AtLocation x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[filter_own]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("x,y=");
    int _xAxis = x.getXAxis();
    _builder.append(_xAxis, "\t");
    _builder.append(",");
    int _yAxis = x.getYAxis();
    _builder.append(_yAxis, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("[/filter_own}]");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _resolve(final Damage x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[filter_own]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[filter_wml]");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("hitpoints=<($this_unit.max_hitpoints-");
    int _health = x.getHealth();
    _builder.append(_health, "\t\t");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[/filter_wml]");
    _builder.newLine();
    _builder.append("[/filter_own]");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _resolve(final UnitEquals x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[filter_own]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("type = ");
    String _unit = x.getUnit();
    _builder.append(_unit, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("[/filter_own]");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _resolve(final Baseline x) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final Goal x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[modify_ai]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("side =1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("action = add");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("path=goal[]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("[goal] ");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _compile = this.compile(x.getGoal());
    _builder.append(_compile, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("value=");
    int _locValue = x.getLocValue();
    _builder.append(_locValue, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("[/goal]");
    _builder.newLine();
    _builder.append("[/modify_ai]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final GoaLocation x) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("name=target_location");
    _builder.newLine();
    _builder.append("[criteria]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("x,y=");
    int _xAxis = x.getXAxis();
    _builder.append(_xAxis, "\t");
    _builder.append(",");
    int _yAxis = x.getYAxis();
    _builder.append(_yAxis, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("[/criteria]\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence resolve(final whenRules x) {
    if (x instanceof AtLocation) {
      return _resolve((AtLocation)x);
    } else if (x instanceof Baseline) {
      return _resolve((Baseline)x);
    } else if (x instanceof Damage) {
      return _resolve((Damage)x);
    } else if (x instanceof UnitEquals) {
      return _resolve((UnitEquals)x);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(x).toString());
    }
  }
}

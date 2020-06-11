/*
 * generated by Xtext 2.21.0
 */
package org.xtext.wesnoth.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.wesnoth.wail.Rule
import org.xtext.wesnoth.wail.Fragment
import org.xtext.wesnoth.wail.Defualt_CA
import org.xtext.wesnoth.wail.Conditional
import org.xtext.wesnoth.wail.AtLocation
import org.xtext.wesnoth.wail.Damage
import org.xtext.wesnoth.wail.UnitEquals
import org.xtext.wesnoth.wail.Baseline
import org.xtext.wesnoth.wail.Goal
import org.xtext.wesnoth.wail.GoaLocation
import org.xtext.wesnoth.wail.ProtectLocation
import org.xtext.wesnoth.wail.ProtectLeader
import java.io.File
import org.xtext.wesnoth.wail.ProtectUnitID
import org.xtext.wesnoth.wail.ProtectUnitType
import org.xtext.wesnoth.wail.IDEquals

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WailGenerator extends AbstractGenerator {

	override void doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (r : res.allContents.toIterable.filter(typeof(Rule))){
			fsa.generateFile("userRules.cfb",r.compile())
		}
	}
		
		def compile(Rule rule)'''
			
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[combat]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[goto]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[recruit_rushers]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[castle_switch]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[retreat_injured]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[grab_villages]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[spread_poison]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[recruitment]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[move_leader_to_goals]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[move_leader_to_keep]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[high_xp_attack]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[place_healers]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[healing]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[villages]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[retreat]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[village_hunt]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[move_to_targets]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[leader_shares_keep]
			[/modify_ai]
			[modify_ai]
			    side=1
			    action=delete
			    path=stage[main_loop].candidate_action[move_to_any_enemy]
			[/modify_ai]
			
			«FOR frag : rule.fragments»
			«frag.compile»
			«ENDFOR»
			
			
			
			«FOR goal:rule.goals»
			«goal.compile»
			«ENDFOR»
		'''
		
		def compile(Fragment frag)'''
		«FOR cas:frag.defualt_cas»
			[modify_ai]
				side =1
				action = add
				path = stage[main_loop].candidate_action[]
					[candidate_action]
					«cas.compile»
						«frag.condition.compile»
					[/candidate_action]
			[/modify_ai]
		«ENDFOR»
		'''
		//go through and add the candidate actions back in by hand
		// look at AiWML page for details under [filter_own]
		def compile(Defualt_CA ca)'''
		«IF ca.caType =="movement"»
			id=goto
			engine=cpp
			name=ai_default_rca::move_to_targets_phase
			«IF ca.cost != 0»
			max_score=«ca.cost»
			score=«ca.cost»
			«ELSE»
			max_score=20000
			score=20000
			«ENDIF»
		«ELSEIF ca.caType=="retreat"»
			id=retreat_injured
			engine=lua
			name=ai_default_rca::retreat_injured
			«IF ca.cost != 0»
			max_score=«ca.cost»
			«ELSE»
			max_score=192000
			«ENDIF»
			location="ai«File.separator»lua«File.separator»retreat.lua"
		«ELSEIF ca.caType == "combat"»
			id=combat
			engine=cpp
			name=ai_default_rca::combat_phase
			«IF ca.cost != 0»
			max_score=«ca.cost»
			score=«ca.cost»
			«ELSE»
			max_score=100000
			score=100000
			«ENDIF»
		«ELSEIF ca.caType =="recruit"»
			id=recruitment
			engine=cpp
			name=default_recruitment::recruitment
			«IF ca.cost != 0»
			max_score=«ca.cost»
			score=«ca.cost»
			«ELSE»
			max_score=180000
			score=180000
			«ENDIF»
		«ELSEIF ca.caType =="combat_value_targets"»
			id=high_xp_attack
			engine=lua
			name=ai_default_rca::high_xp_attack
			location="ai«File.separator»lua«File.separator»ca_high_xp_attack.lua"
			«IF ca.cost != 0»
			max_score=«ca.cost»
			«ELSE»
			max_score=100010
			«ENDIF»
		«ELSEIF ca.caType == "capture_villages"»
			id=villages
			engine=cpp
			name=ai_default_rca::get_villages_phase
			«IF ca.cost != 0»
			max_score=«ca.cost»
			score=«ca.cost»
			«ELSE»
			max_score=60000
			score=60000
			«ENDIF»
		«ELSEIF ca.caType =="leader_to_keep"»
			id=move_leader_to_keep
			engine=cpp
			name=ai_default_rca::move_leader_to_keep_phase
			«IF ca.cost != 0»
			max_score=«ca.cost»
			score=«ca.cost»
			«ELSE»
			max_score=120000
			score=120000
			«ENDIF»
		«ELSEIF ca.caType =="heal"»
			id=healing
			engine=cpp
			name=ai_default_rca::get_healing_phase
			«IF ca.cost != 0»
			max_score=«ca.cost»
			score=«ca.cost»
			«ELSE»
			max_score=80000
			score=80000
			«ENDIF»
		«ENDIF»
		'''
		def compile(Conditional con)'''	
		[filter_own]
			«FOR conFrag : con.x»
			«conFrag.resolve»
			«ENDFOR»
		[/filter_own] 
		'''

		def dispatch resolve(AtLocation x)'''
			x,y=«x.XAxis»,«x.YAxis»
		'''
		def dispatch resolve(Damage x)'''
			[filter_wml]
				hitpoints=<($this_unit.max_hitpoints-«x.health»)
			[/filter_wml]
		'''
		def dispatch resolve(UnitEquals x)'''
			type = «x.unit»
		'''
		def dispatch resolve(IDEquals x)'''
			id = «x.unitID»
		'''
		def dispatch resolve(Baseline x)'''
		'''
		def compile(Goal x)'''
		[modify_ai]
			side =1
			action = add
			path=goal[]
			[goal] 
				«x.goal.resolve»
			[/goal]
		[/modify_ai]
		'''
		def dispatch resolve(GoaLocation x)'''
		name=target_location
		[criteria]
			x,y=«x.XAxis»,«x.YAxis»
		[/criteria]
		value=«x.locValue»
		'''
		def dispatch resolve(ProtectLocation x)'''
		name=protect_location
		[criteria]
			x,y=«x.XAxis»,«x.YAxis»
		[/criteria]
		protect_radius=«x.procRad»
		value=«x.locValue»
		'''
		def dispatch resolve(ProtectLeader x)'''
		name=protect_location
		[criteria]
			side=«x.procSide»
			canrecruit=yes
		[/criteria]
		protect_radius=«x.protectionRadius»
		value=«x.locationValue»
		'''
		def dispatch resolve(ProtectUnitID x)'''
		name=protect_location
		[criteria]
			side=«x.procSide»
			id=«x.procID»
		[/criteria]
		protect_radius=«x.protectionRadius»
		value=«x.locationValue»
		'''
		def dispatch resolve(ProtectUnitType x)'''
		name=protect_location
		[criteria]
			side=«x.procSide»
			type=«x.procType»
		[/criteria]
		protect_radius=«x.protectionRadius»
		value=«x.locationValue»
		'''
}

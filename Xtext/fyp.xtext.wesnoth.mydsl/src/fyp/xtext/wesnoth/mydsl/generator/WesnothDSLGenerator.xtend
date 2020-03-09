/*
 * generated by Xtext 2.20.0
 */
package fyp.xtext.wesnoth.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import fyp.xtext.wesnoth.mydsl.wesnothDSL.Rule
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Defualt_CA
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Fragment
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Conditional
import fyp.xtext.wesnoth.mydsl.wesnothDSL.AtLocation
import fyp.xtext.wesnoth.mydsl.wesnothDSL.HealthLevelGreater
import fyp.xtext.wesnoth.mydsl.wesnothDSL.HeathLevelEquals
import fyp.xtext.wesnoth.mydsl.wesnothDSL.HealthLevelLess
import fyp.xtext.wesnoth.mydsl.wesnothDSL.UnitEquals
import fyp.xtext.wesnoth.mydsl.wesnothDSL.Damage

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WesnothDSLGenerator extends AbstractGenerator {

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
			    path=stage[main_loop].candidate_action[move_to_tagets]
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
		'''
		
		def compile(Fragment frag)'''
		«FOR cas:frag.defualt_cas»
			[modify_ai]
				side =1
				action = add
				path = stage[main_loop].candidate_action[]
					[candidate_action]
					
					[filter_own]
					«cas.compile»
					«frag.condition.compile»
					[/filter_own]
					[/candidate_action
			[/modify_ai]
		«ENDFOR»
		'''
		
		def compile(Defualt_CA ca)'''
		'''
		def compile(Conditional con)'''
		«con.condition.compile»
		'''
		def compile(AtLocation x)'''
		x,y=«x.x»,«x.y»
		'''
		def compile(Damage x)'''
		[filter_wml]
			hitpoints=($this_unit.max_hitpoints-«x.health»)
		[/filter_wml]
		'''
		def compile(UnitEquals x)'''
		type = «x.unit»
		'''
	
		
}

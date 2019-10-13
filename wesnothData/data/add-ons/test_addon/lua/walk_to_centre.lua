local AH = wesnoth.require "ai/lua/ai_helper.lua"

local function get_unit(cfg)
  local filter = cfg.filter or { id = cfg.id }
  local unit = AH.get_units_with_moves {
    side = wesnoth.current.side,
    {"and",filter}
  }[1]
  return unit

end

local ca_return_unit = {}

function ca_return_unit:evaluation(cfg)
  local unit = get_unit(cfg)
  print ("got unit 1")
  if unit then
    return 250000
  end
  return 0
end

function ca_return_unit:execution(cfg)
  local width, height = wesnoth.get_map_size()
  local targetX = (width - width % 2) / 2
  local targetY = (height - height % 2) / 2
  local unit = get_unit(cfg)

  -- If targt hex is occupied find a vacant hex, if not set to x and y
  if(unit.x ~= targetX) or (unit.x ~= targetY) then
    targetX,targetY = wesnoth.find_vacant_tile(targetX,targetY, unit)
  end

  --find closest hex the unit can move in one turn
  local next_hop = AH.next_hop(unit, targetX,targetY)
  if(not next_hop) then next_hop = {unit.x,unit.y} end

  if ((next_hop[1] ~= unit.x) or (next_hop[2] ~= unit.y)) then
    ai.move_full(unit, next_hop[1], next_hop[2])
  else
    ai.stopunit_moves(unit)
  end
end

return ca_return_unit

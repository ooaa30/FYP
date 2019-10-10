local AH = wesnoth.require "ai/lua/ai_helper.lua"

local function get_unit(cfg)
  local filter cfg.filter or { id = cfg.id }
  local unit = AH.get_units_with_moves {
    side = wesnoth.current.side,
    {"and",filter}
  }[1]
  return unit

end

local ca_return_unit = {}

function ca_return_unit:evaluation(ai,cfg)
  local unit = get_unit(cfg)
  if unit then
    return 250000
  end
  return 0
end

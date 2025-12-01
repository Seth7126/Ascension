// 函数: _ZN9ascension16LoadLuaFunctionsEiPPFvP9lua_StateEPKc
// 地址: 0xec890
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i_1 = arg1
void (** r5)(lua_State*) = arg2
int32_t r0 = lua_newstate(sub_ecc10, 0)
data_1e415c = r0
luaL_openlibs(r0, &data_1e415c)
lua_pushcclosure(data_1e415c, ascension::LuaPrint, 0)
lua_setglobal(data_1e415c, "print")
lua_pushcclosure(data_1e415c, ascension::LoadLuaFile, 0)
lua_setglobal(data_1e415c, "LoadLuaFile")
ascension::CEffect::RegisterLua(data_1e415c)
ascension::CEffectList::RegisterLua(data_1e415c)
ascension::CCard::RegisterLua(data_1e415c)
core::CCardInstance::RegisterLua(data_1e415c)
ascension::CCardInPlayAbilityDefinition::RegisterLua(data_1e415c)
ascension::CCardInPlayAbilityInstance::RegisterLua(data_1e415c)
ascension::CCardInPlayInstance::RegisterLua(data_1e415c)
ascension::CDatabase::RegisterLua(data_1e415c)
core::CInstance::RegisterLua(data_1e415c)
ascension::CActiveEffectDefinition::RegisterLua(data_1e415c)
ascension::CContinuousEffectDefinition::RegisterLua(data_1e415c)
ascension::CTriggeredEffectDefinition::RegisterLua(data_1e415c)
ascension::CActiveEffectInstance::RegisterLua(data_1e415c)
core::CWorldBase::RegisterLua(data_1e415c)
core::CInstance::RegisterLua(data_1e415c)
ascension::CConstructAbilityDefinition::RegisterLua(data_1e415c)
core::CInstance::RegisterLua(data_1e415c)
ascension::CConstructInstance::RegisterLua(data_1e415c)
ascension::CTrophyInstance::RegisterLua(data_1e415c)
CStateMachine::RegisterLua(data_1e415c)

if (i_1 s>= 1)
    int32_t i
    
    do
        void (* r1_2)(lua_State*) = *r5
        r5 = &r5[1]
        r1_2(data_1e415c)
        i = i_1
        i_1 -= 1
    while (i != 1)

data_1e2500 = arg3
ascension::LoadLuaFile("ascension/database/effect_functions.lua", arg3)
ascension::LoadLuaFile("ascension/database/set1_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set2_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set3_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set4_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set5_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set6_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set7_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set8_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set9_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set10_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set11_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set12_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set13_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set14_load.lua", arg3)
ascension::LoadLuaFile("ascension/database/set1_anniv_load.lua", arg3)
return ascension::LoadLuaFile("ascension/database/promo_load.lua", arg3) __tailcall

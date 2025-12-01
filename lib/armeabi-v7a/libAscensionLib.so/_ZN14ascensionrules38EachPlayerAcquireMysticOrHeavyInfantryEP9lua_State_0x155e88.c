// 函数: _ZN14ascensionrules38EachPlayerAcquireMysticOrHeavyInfantryEP9lua_State
// 地址: 0x155e88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata(arg1, 1)
int32_t* r0_2 = lua_touserdata(arg1, 2)
int32_t i = 0
int32_t r0_4 = lua_tointegerx(arg1, 3, 0)
int32_t r0_6 = lua_tointegerx(arg1, 4, 0)
int32_t r0_8 = lua_tointegerx(arg1, 5, 0)
ascension::CPlayer* r7 = *(r0 + 4)
int32_t r0_10 = *(r7 + 0x1c) - *(r7 + 0x18)

if (r0_10 s>= 1)
    CState* r6_1 = *r0_2
    
    do
        ascension::CPlayer* r0_12 = ascension::CWorld::GetPlayerByTurnOrder(r7, r0)
        CState* r0_15 = ascensionrules::CreateStateProcessAcquireMysticOrHeavyInfantry(r0_12, r0_4, 
            1, r0_6, r0_8, 1)
        
        if (r0_12 != r0 && zx.d(*(r7 + 0xa2d)) != 0)
            ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_12, nullptr, nullptr, 0, 
                r0, r0_15, true)
            ascension::CPlayer::AddPendingAsyncState(r0_12)
        else
            CState::AddOwnedChild(r6_1)
            CStateList::AppendState(r6_1)
        
        i += 1
    while (i s< r0_10 s>> 2)

return 0

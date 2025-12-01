// 函数: _ZN14ascensionrules39EachOpponentDiscardsLowestCostConstructEP9lua_State
// 地址: 0x156f28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata(arg1, 1)
int32_t* r0_2 = lua_touserdata(arg1, 2)
ascension::CPlayer* r9 = *(r0 + 4)
int32_t r1_1 = *(r9 + 0x1c) - *(r9 + 0x18)

if (r1_1 s>= 1)
    CState* r8_1 = *r0_2
    int32_t i = 0
    
    do
        ascension::CPlayer* r0_4 = ascension::CWorld::GetPlayerByTurnOrder(r9, r0)
        
        if (r0_4 != r0)
            CState* r0_5 = ascensionrules::CreateStateProcessDiscardLowestCostConstruct(r0_4)
            int32_t r0_8
            
            if (zx.d(*(r9 + 0xa2d)) != 0)
                r0_8 = ascension::CPlayer::CountConstructsInPlay(r0_4, false, nullptr)
            
            if (zx.d(*(r9 + 0xa2d)) == 0 || r0_8 s< 1)
                CState::AddOwnedChild(r8_1)
                CStateList::AppendState(r8_1)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0, 
                    *(*(r9 + 0xbdc) - 8), nullptr, 0, r0_4, r0_5, false)
                ascension::CPlayer::AddPendingAsyncState(r0_4)
        
        i += 1
    while (i s< r1_1 s>> 2)

return 0

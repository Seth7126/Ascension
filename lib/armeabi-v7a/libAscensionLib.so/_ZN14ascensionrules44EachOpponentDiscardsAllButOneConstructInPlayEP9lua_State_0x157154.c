// 函数: _ZN14ascensionrules44EachOpponentDiscardsAllButOneConstructInPlayEP9lua_State
// 地址: 0x157154
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata(arg1, 1)
int32_t* r0_2 = lua_touserdata(arg1, 2)
ascension::CPlayer* r5 = *(r0 + 4)
CState* r8 = *r0_2

if (*(r5 + 0x30) u< 2)
    for (ascension::CPlayer** i = *(r5 + 0x18); i != *(r5 + 0x1c); i = &i[1])
        ascension::CPlayer* r6_2 = *i
        
        if (r6_2 != r0)
            CState* r0_20 = ascensionrules::CreateStateProcessDiscardAllButOneConstructInPlay(r6_2)
            int32_t r0_23
            
            if (zx.d(*(r5 + 0xa2d)) != 0)
                r0_23 = ascension::CPlayer::CountConstructsInPlay(r6_2, false, nullptr)
            
            if (zx.d(*(r5 + 0xa2d)) == 0 || r0_23 s< 2)
                CState::AddOwnedChild(r8)
                CStateList::AppendState(r8)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0, 
                    *(*(r5 + 0xbdc) - 8), nullptr, 0, r6_2, r0_20, false)
                ascension::CPlayer::AddPendingAsyncState(r6_2)
else
    int32_t r0_5 = *(r5 + 0x1c) - *(r5 + 0x18)
    
    if (r0_5 s>= 1)
        int32_t i_1 = 0
        
        do
            ascension::CPlayer* r0_7 = ascension::CWorld::GetPlayerByTurnOrder(r5, r0)
            
            if (r0_7 != r0)
                CState* r0_8 =
                    ascensionrules::CreateStateProcessDiscardAllButOneConstructInPlay(r0_7)
                int32_t r0_11
                
                if (zx.d(*(r5 + 0xa2d)) != 0)
                    r0_11 = ascension::CPlayer::CountConstructsInPlay(r0_7, false, nullptr)
                
                if (zx.d(*(r5 + 0xa2d)) == 0 || r0_11 s< 1)
                    CState::AddOwnedChild(r8)
                    CStateList::AppendState(r8)
                else
                    ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0, 
                        *(*(r5 + 0xbdc) - 8), nullptr, 0, r0_7, r0_8, false)
                    ascension::CPlayer::AddPendingAsyncState(r0_7)
            
            i_1 += 1
        while (i_1 s< r0_5 s>> 2)

return 0

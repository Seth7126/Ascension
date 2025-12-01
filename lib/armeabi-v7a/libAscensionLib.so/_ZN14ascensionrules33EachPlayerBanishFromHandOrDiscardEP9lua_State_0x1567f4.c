// 函数: _ZN14ascensionrules33EachPlayerBanishFromHandOrDiscardEP9lua_State
// 地址: 0x1567f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata(arg1, 1)
int32_t* r0_2 = lua_touserdata(arg1, 2)
int32_t r0_4 = lua_tointegerx(arg1, 3, 0)
ascension::CPlayer* r10 = *(r0 + 4)
int32_t r0_6 = *(r10 + 0x1c) - *(r10 + 0x18)

if (r0_6 s>= 1)
    CState* r9_1 = *r0_2
    int32_t i = 0
    
    do
        ascension::CPlayer* r0_9 = ascension::CWorld::GetPlayerByTurnOrder(r10, r0)
        CState* r0_10 = ascensionrules::CreateStateProcessBanishFromHandOrDiscardOrSource(r0_9, 
            r0_4, true, true, false, 0, nullptr, nullptr, nullptr, nullptr, 0)
        
        if (r0_9 != r0 && zx.d(*(r10 + 0xa2d)) != 0)
            ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_9, nullptr, nullptr, 0, 
                r0, r0_10, true)
            ascension::CPlayer::AddPendingAsyncState(r0_9)
        else
            CState::AddOwnedChild(r9_1)
            CStateList::AppendState(r9_1)
        
        i += 1
    while (i s< r0_6 s>> 2)

return 0

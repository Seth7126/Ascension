// 函数: _ZN14ascensionrules57CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated11UpdateStateER13CStateMachine
// 地址: 0x133240
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0 && *(arg1 + 0x254) != 0)
    int32_t r6_1 = *(*(arg1 + 0x24c) + 4)
    
    if (zx.d(*(arg1 + 0x258)) != 0)
        ascension::CWorld::RemoveCenterRowCard(r6_1, *(arg1 + 0x250))
        *(arg1 + 0x258) = 0
    
    if (zx.d(*(arg1 + 0x259)) == 0)
        ascension::CWorld::OutputPauseBrief(r6_1)
        *(arg1 + 0x259) = 1
        return 1
    
    if (zx.d(*(arg1 + 0x25a)) == 0)
        ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterRowStackDeprecated::BuildOptionList(
            arg1)
        *(arg1 + 0x25a) = 1
        return 1
    
    if (zx.d(*(arg1 + 0x2a4)) == 0 && *(arg1 + 0x250) != 0xffffffff)
        ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x24c), arg1 + 0x2a8, 
            nullptr, 0)
        CState* entry_r1
        CStateMachine::PushOwnedState(entry_r1)
        *(arg1 + 0x2a4) = 1
        return 1

return CGameStateOptions::UpdateState(arg1) __tailcall

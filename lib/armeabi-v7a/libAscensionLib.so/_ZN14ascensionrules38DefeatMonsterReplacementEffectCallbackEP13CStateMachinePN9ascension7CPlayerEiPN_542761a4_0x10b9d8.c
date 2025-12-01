// 函数: _ZN14ascensionrules38DefeatMonsterReplacementEffectCallbackEP13CStateMachinePN9ascension7CPlayerEiPN4core13CCardInstanceEPNS5_9CInstanceE
// 地址: 0x10b9d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg4 == 0 || *(*(arg4 + 0xc) + 0x88) != 3)
    return 0

int32_t var_20_1 = 0
ascension::CWorld::OutputEvent(*(arg2 + 4), 0x16, zx.d(*(arg2 + 8)), zx.d(*(arg4 + 8)))
ascensionrules::CreateStateProcessAcquireOrDefeatTopOfCenterRowStack(arg2, arg3, false)
CStateMachine::PushOwnedState(arg1)
return 1

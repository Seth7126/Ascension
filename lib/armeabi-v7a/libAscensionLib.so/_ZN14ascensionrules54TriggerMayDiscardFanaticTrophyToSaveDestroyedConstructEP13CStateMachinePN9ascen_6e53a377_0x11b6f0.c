// 函数: _ZN14ascensionrules54TriggerMayDiscardFanaticTrophyToSaveDestroyedConstructEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b6f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *(arg4 + 4)

if (r0 != 0x19)
    return r0

ascension::CPlayer* r0_1 = *(arg4 + 0x4c)

if (r0_1 == 0)
    return r0_1

ascensionrules::CreateStateMayDiscardFanaticTrophyToSaveDestroyedConstruct(r0_1, arg4)
return CStateMachine::PushListState(arg1) __tailcall

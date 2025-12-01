// 函数: _ZN14ascensionrules30TriggerMayPutConstructIntoPlayEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b6a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *(arg4 + 4)

if (r0 != 0x12)
    return r0

ascension::CPlayer* r0_1 = *(arg3 + 0xc)

if (r0_1 != 0)
    core::CCardInstance* r1 = *(arg4 + 0x50)
    
    if (r1 != 0)
        ascensionrules::CreateStateMayPutConstructIntoPlay(r0_1, r1, arg4, arg2)
        return CStateMachine::PushListState(arg1) __tailcall

return r0_1

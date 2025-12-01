// 函数: _ZN14ascensionrules28GainCurrentEventTrophyEffectEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107e04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CInstance* r3 = *(arg2 + 0xa6c)

if (r3 == 0)
    return 

ascension::CEffect* r4_1 = *(*(*(r3 + 0x10) + 0xc) + 0xf0)

if (r4_1 != 0)
    ascensionrules::CreateStateProcessCardEffect(arg2, arg3, r4_1, r3, nullptr, nullptr, 0)
    return CStateMachine::PushListState(arg1) __tailcall

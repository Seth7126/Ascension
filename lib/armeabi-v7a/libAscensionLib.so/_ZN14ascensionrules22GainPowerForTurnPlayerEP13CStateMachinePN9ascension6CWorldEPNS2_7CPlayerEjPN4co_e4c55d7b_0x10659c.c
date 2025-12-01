// 函数: _ZN14ascensionrules22GainPowerForTurnPlayerEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10659c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r6 = *(arg2 + 0xb20)

if (r6 == 0)
    return 

ascension::CWorld::OutputAnimationPower(arg2, arg4, arg5)
ascension::CWorld::AddCurrentTurnPower(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d power\n", (*(*r6 + 0xc))(r6), arg4)
    __tailcall

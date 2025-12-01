// 函数: _ZN14ascensionrules25GainPowerForBanishedCardsEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106328
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = arg6 + arg4
uint32_t r4 = zx.d(*(result + 4))

if (r4 == 0)
    return result

ascension::CWorld::OutputAnimationPower(arg2, r4, arg5)
ascension::CWorld::AddCurrentTurnPower(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d power\n", (*(*arg3 + 0xc))(arg3), 
    r4) __tailcall

// 函数: _ZN14ascensionrules36TriggerGainEnergyForCardsUnderTrophyEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11b1e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = (*(arg3 + 0x40) - *(arg3 + 0x3c)) s>> 2
core::CInstance* r4 = result * arg5

if (r4 s< 1)
    return result

int32_t* r5 = *(arg3 + 0xc)
char* r6 = r5[1]
ascension::CWorld::OutputAnimationEnergy(r6, r4, arg3)
ascension::CWorld::AddCurrentTurnEnergy(r6)
return core::CWorldBase::OutputMessageFormat(r6, "%s gains %d energy\n", (*(*r5 + 0xc))(r5), r4)
    __tailcall

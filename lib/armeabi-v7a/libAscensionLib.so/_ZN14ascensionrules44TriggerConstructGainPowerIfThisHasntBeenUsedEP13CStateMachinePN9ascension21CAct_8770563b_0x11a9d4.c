// 函数: _ZN14ascensionrules44TriggerConstructGainPowerIfThisHasntBeenUsedEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a9d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = *(arg3 + 0xc)
char* r4 = r7[1]
int32_t result = ascension::CWorld::HasPlayedActiveEffect(r4)

if (result != 0)
    return result

ascension::CWorld::OutputAnimationPower(r4, arg5, arg3)
ascension::CWorld::AddCurrentTurnPower(r4)
return core::CWorldBase::OutputMessageFormat(r4, "%s gains %d power from %s\n", (*(*r7 + 0xc))(r7), 
    arg5, (*(*arg3 + 0xc))(arg3))

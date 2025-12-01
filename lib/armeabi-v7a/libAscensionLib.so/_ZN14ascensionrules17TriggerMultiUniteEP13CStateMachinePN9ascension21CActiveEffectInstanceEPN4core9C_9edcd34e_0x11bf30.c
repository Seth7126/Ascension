// 函数: _ZN14ascensionrules17TriggerMultiUniteEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11bf30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_2 = *(arg4 + 4)

if (r0_2 != 0x14)
    return r0_2

void* r12 = *(arg2 + 0x14)
uint32_t r0 = *(r12 + 4)

if (zx.d(*(r0 + 0xa14)) != 0)
    return r0

uint32_t var_10 = zx.d(*(*(arg4 + 0x50) + 8))
return ascension::CWorld::OutputEvent(r0, 0x14, zx.d(*(r12 + 8)), zx.d(*(arg3 + 8)))

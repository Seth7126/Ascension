// 函数: _ZN14ascensionrules17PopResolvingEventEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1134f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r6 = *(arg2 + 0xa6c)

if (r6 == 0)
    return 

uint32_t r5 = *(r6 + 0x10)
ascension::CWorld::PopResolveEffect(arg2)
uint32_t var_2c
uint32_t var_24
uint32_t r1_1
int32_t r2

if (r6 == *(arg2 + 0xa6c))
    int32_t var_30_1 = 0
    var_2c = 0xd
    r1_1 = r5
    r2 = 7
    int32_t var_28_1 = 0
    var_24 = 0
else
    int32_t var_30 = 0
    var_2c = 9
    r2 = 6
    var_24 = &__elf_header
    r1_1 = r5
    int32_t var_28 = 0

int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(arg2, r1_1, r2, 0xb, 0, var_2c, 0, var_24)
return ascension::CWorld::OutputPauseForAllAnimation() __tailcall

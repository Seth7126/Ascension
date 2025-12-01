// 函数: _ZN14ascensionrules24TriggerPopResolvingEventEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c97c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r4 = *(arg3 + 4)
uint32_t r5 = *(arg3 + 0x10)
ascension::CWorld::PopResolveEffect(r4)
uint32_t var_2c
uint32_t var_24
uint32_t r1_1
int32_t r2

if (*(r4 + 0xa6c) == arg3)
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
ascension::CWorld::OutputAnimationCard(r4, r1_1, r2, 0xb, 0, var_2c, 0, var_24)
return ascension::CWorld::OutputPauseForAllAnimation() __tailcall

// 函数: _ZN14ascensionrules40GainHonorForCenterRowHeroesAndConstructsEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107524
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r6 = 0
void* r0_1 = ascension::CWorld::GetCenterRowCard(arg2)

if (r0_1 != 0)
    void* r0_2 = *(r0_1 + 0xc)
    
    if (*(r0_2 + 0x88) - 1 u<= 1)
        r6 = *(r0_2 + 0xa4)

void* r0_4 = ascension::CWorld::GetCenterRowCard(arg2)

if (r0_4 != 0)
    void* r0_5 = *(r0_4 + 0xc)
    
    if (*(r0_5 + 0x88) - 1 u<= 1)
        r6 += *(r0_5 + 0xa4)

void* r0_8 = ascension::CWorld::GetCenterRowCard(arg2)

if (r0_8 != 0)
    void* r0_9 = *(r0_8 + 0xc)
    
    if (*(r0_9 + 0x88) - 1 u<= 1)
        r6 += *(r0_9 + 0xa4)

void* r0_12 = ascension::CWorld::GetCenterRowCard(arg2)

if (r0_12 != 0)
    void* r0_13 = *(r0_12 + 0xc)
    
    if (*(r0_13 + 0x88) - 1 u<= 1)
        r6 += *(r0_13 + 0xa4)

void* r0_16 = ascension::CWorld::GetCenterRowCard(arg2)

if (r0_16 != 0)
    void* r0_17 = *(r0_16 + 0xc)
    
    if (*(r0_17 + 0x88) - 1 u<= 1)
        r6 += *(r0_17 + 0xa4)

void* r0_20 = ascension::CWorld::GetCenterRowCard(arg2)

if (r0_20 != 0)
    void* r0_21 = *(r0_20 + 0xc)
    
    if (*(r0_21 + 0x88) - 1 u<= 1)
        r6 += *(r0_21 + 0xa4)

void* r0_24
ascension::CWorld* r1_19
r0_24, r1_19 = ascension::CWorld::GetCenterRowCard(arg2)

if (r0_24 != 0)
    void* r0_25 = *(r0_24 + 0xc)
    r1_19 = *(r0_25 + 0x88) - 1
    
    if (r1_19 u<= 1)
        r6 += *(r0_25 + 0xa4)

return ascensionrules::GainHonor(arg1, r1_19, arg3, r6, arg5)

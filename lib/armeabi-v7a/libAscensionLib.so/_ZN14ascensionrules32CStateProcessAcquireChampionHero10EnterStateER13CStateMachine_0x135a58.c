// 函数: _ZN14ascensionrules32CStateProcessAcquireChampionHero10EnterStateER13CStateMachine
// 地址: 0x135a58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x250)
void* r1 = *(arg1 + 0x24c)
*(arg1 + 0x25c) = 0
*(arg1 + 0x258) = 0
ascension::CActiveEffectDefinition* r5 = *(r1 + 4)
void* r6 = *(*(r2 + 0xc) + 0x150)
*(arg1 + 0x258) = ascension::CWorld::CreateCard(r5)
int32_t* r7 = *(r6 + 0x130)

if (r7 != *(r6 + 0x134))
    core::CInstance* r1_2 = *r7
    void* r7_1 = &r7[1]
    
    while (true)
        ascension::CWorld::AddGlobalActiveEffect(r5, r1_2)
        
        if (r7_1 == *(r6 + 0x134))
            break
        
        r1_2 = *r7_1
        r7_1 += 4
        *(arg1 + 0x258)

ascension::CWorld::OutputEvent(r5, 0x17, zx.d(*(*(arg1 + 0x24c) + 8)), 0)
core::CWorldBase::OutputMessageFormat(r5, "%s acquires %s\n", *(arg1 + 0x24c) + 0x10, r6 + 4, 0)
ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x258))
uint32_t var_28 = zx.d(*(*(arg1 + 0x258) + 8))
ascension::CWorld::OutputEvent(r5, 0xf, zx.d(*(*(arg1 + 0x24c) + 8)), 0)
*(arg1 + 0x25c) = 1
return 1

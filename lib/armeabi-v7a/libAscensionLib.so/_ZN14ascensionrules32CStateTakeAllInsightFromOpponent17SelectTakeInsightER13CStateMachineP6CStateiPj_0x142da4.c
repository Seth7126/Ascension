// 函数: _ZN14ascensionrules32CStateTakeAllInsightFromOpponent17SelectTakeInsightER13CStateMachineP6CStateiPj
// 地址: 0x142da4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = *(arg2 + 0x24c)
int32_t r6 = r5[1]
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r6)
core::CInstance* r7 = *(arg2 + 0x250)

if (r7 == 0)
    r7 = r0_1[0x23]
    
    if (r7 s>= 1)
    label_142e10:
        ascension::CPlayer::RemoveInsightCount(r0_1)
        ascension::CPlayer::AddInsightCount(r5)
        
        if (r5 == *(r6 + 0xb20))
            ascension::CWorld::AddInsightGainedThisTurn(r6)
        
        int32_t var_28_1 = 0
        ascension::CWorld::OutputAnimationInsight(r6, r7, r5, r0_1)
else
    if (*(r6 + 0x30) u>= 0x22)
        core::CInstance* r0_3 = r0_1[0x23]
        
        if (r7 s> r0_3)
            r7 = r0_3
    
    if (r7 s>= 1)
        goto label_142e10

core::CWorldBase::OutputMessageFormat(r6, "%s takes %d insight from %s\n", (*(*r5 + 0xc))(r5), r7, 
    (*(*r0_1 + 0xc))(r0_1))
int32_t* result = *(arg2 + 0x254)

if (result != 0)
    void* r2_3 = result + *result + 4
    uint32_t r1_8 = zx.d(*r2_3)
    
    if (r1_8 u<= 7)
        uint32_t r3_2 = zx.d(r0_1[2].w)
        *r2_3 = r1_8.b + 1
        result = &result[*result * 8 + r1_8]
        result[4] = r3_2

return result

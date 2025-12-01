// 函数: _ZN14ascensionrules25CStateRemoveCenterRowCard10EnterStateER13CStateMachine
// 地址: 0x14ad5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* __offset(CStateMachine, 0x5c) r2 = *(arg1 + 0x50)
int32_t r1 = *(arg1 + 0x44)
*(arg1 + 0x58) = 0

if (r2 == 0)
    r2 = arg1 + 0x5c

*(r2 + 0x58) |= r1
core::CCardInstance* r5 = *(*(arg1 + 0x30) + 4)

if (*(arg1 + 0x38) == 0)
    *(arg1 + 0x3c)
    *(arg1 + 0x38) = ascension::CWorld::RemoveCenterRowCard(r5, (*(arg1 + 0x34)).b)
else if (*(r5 + 0x30) u<= 0x12)
    *(arg1 + 0x38) = 0

void* r9

if (zx.d(*(arg1 + 0x3d)) == 0)
    r9 = r5 + 0x30
label_14af0c:
    int32_t** result = *r9
    
    if (result u>= 0xd)
    label_14af18:
        *(arg1 + 0x34)
        result = ascension::CWorld::GetCenterRowCardStackList(r5)
        
        if (result != 0)
            int32_t* r1_18 = *result
            result = result[1]
            
            if ((result - r1_18) s>> 3 u>= 2)
                result = *(result - 4)
                
                if (result == 3)
                    result = r1_18[1]
                    
                    if (result == 2)
                        int32_t r6_2 = *r1_18
                        void* r7_2 = *(r6_2 + 0xc)
                        ascension::CWorld::RemoveCenterRowCard(r5, *(arg1 + 0x34))
                        *(r7_2 + 0x88)
                        return ascension::CWorld::PutCardOnCenterRow(r5, *(arg1 + 0x34), r6_2)
                            __tailcall
    
    return result

*(arg1 + 0x34)
int32_t* r0_4 = ascension::CWorld::GetCenterRowCardStackList(r5)
int32_t r0_5 = r0_4[1]
r9 = r5 + 0x30

if (*r0_4 == r0_5)
    goto label_14af0c

while (true)
    int32_t r1_7 = *(r0_5 - 4)
    bool cond:2_1 = r1_7 u> 3
    
    if (r1_7 != 3)
        cond:2_1 = *r9 u> 0xc
    
    if (cond:2_1)
        break
    
    int32_t* r7_1 = *(r0_5 - 8)
    
    if (*(r7_1[3] + 0x88) != 6)
        goto label_14af0c
    
    *(arg1 + 0x3c)
    ascension::CWorld::RemoveCenterRowCard(r5, (*(arg1 + 0x34)).b)
    int32_t var_38_1 = 0
    ascension::CWorld::AddToAcquiredCards(r5, r7_1.b, 7, 3)
    ascension::CWorld::OutputEvent(r5, 4, zx.d(*(*(arg1 + 0x30) + 8)), zx.d(r7_1[2].w))
    ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
    int32_t var_34
    uint32_t var_30
    int32_t var_2c
    int32_t var_28
    core::CWorldBase::OutputMessageFormat(r5, "%s acquires %s\n", *(arg1 + 0x30) + 0x10, 
        (*(*r7_1 + 0xc))(r7_1), 0, var_34, var_30, var_2c, var_28)
    var_34 = 3
    var_30 = zx.d(*(*(arg1 + 0x30) + 8))
    var_2c = 0
    var_28 = 0
    ascension::CWorld::OutputAnimationCard(r5, r7_1, 3, 7, *(arg1 + 0x34), 3, var_30, 0)
    ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
    r0_5 = r0_4[1]
    
    if (*r0_4 == r0_5)
        goto label_14af0c

goto label_14af18
